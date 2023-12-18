/*
 * Tencent is pleased to support the open source community by making BK-JOB蓝鲸智云作业平台 available.
 *
 * Copyright (C) 2021 THL A29 Limited, a Tencent company.  All rights reserved.
 *
 * BK-JOB蓝鲸智云作业平台 is licensed under the MIT License.
 *
 * License for BK-JOB蓝鲸智云作业平台:
 * --------------------------------------------------------------------
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 * documentation files (the "Software"), to deal in the Software without restriction, including without limitation
 * the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and
 * to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of
 * the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO
 * THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF
 * CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS
 * IN THE SOFTWARE.
 */

package com.tencent.bk.job.execute.dao;

import com.tencent.bk.job.common.constant.ExecuteObjectTypeEnum;
import com.tencent.bk.job.execute.engine.model.ExecuteObject;

import java.util.Collection;
import java.util.List;

public interface TaskInstanceExecuteObjectDAO {
    /**
     * 批量保存执行对象
     *
     * @param executeObjects 执行对象
     */
    void batchSaveExecuteObjects(Collection<ExecuteObject> executeObjects);

    /**
     * 根据作业实例ID获取执行对象
     *
     * @param jobInstanceId 作业实例ID
     * @return 执行对象
     */
    List<ExecuteObject> listExecuteObjectsByJobInstanceId(long jobInstanceId);


    /**
     * 根据执行对象ID查询执行对象
     *
     * @param executeObjectId 执行对象ID
     * @return 执行对象
     */
    ExecuteObject getExecuteObjectById(long executeObjectId);

    /**
     * 根据执行对象ID查询执行对象
     *
     * @param executeObjectType 执行对象类型
     * @param resourceId        执行对象资源ID
     * @return 执行对象
     */
    ExecuteObject getExecuteObject(ExecuteObjectTypeEnum executeObjectType, String resourceId);
}
