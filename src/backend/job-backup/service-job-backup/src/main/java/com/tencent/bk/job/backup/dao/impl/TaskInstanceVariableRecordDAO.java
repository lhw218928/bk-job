package com.tencent.bk.job.backup.dao.impl;

import com.tencent.bk.job.backup.config.ArchiveConfig;
import org.jooq.DSLContext;
import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.generated.tables.TaskInstanceVariable;
import org.jooq.generated.tables.records.TaskInstanceVariableRecord;

import java.util.Arrays;
import java.util.List;

/**
 * task_instance_variable DAO
 */
public class TaskInstanceVariableRecordDAO extends AbstractExecuteRecordDAO<TaskInstanceVariableRecord> {

    private static final TaskInstanceVariable TABLE = TaskInstanceVariable.TASK_INSTANCE_VARIABLE;

    private static final List<Field<?>> FIELDS =
        Arrays.asList(
            TABLE.ID,
            TABLE.TASK_INSTANCE_ID,
            TABLE.NAME,
            TABLE.TYPE,
            TABLE.VALUE,
            TABLE.IS_CHANGEABLE,
            TABLE.ROW_CREATE_TIME,
            TABLE.ROW_UPDATE_TIME
        );

    public TaskInstanceVariableRecordDAO(DSLContext context, ArchiveConfig archiveConfig) {
        super(context, archiveConfig);
    }

    @Override
    public List<Field<?>> listFields() {
        return FIELDS;
    }

    @Override
    public Table<TaskInstanceVariableRecord> getTable() {
        return TABLE;
    }

    @Override
    public TableField<TaskInstanceVariableRecord, Long> getArchiveIdField() {
        return TABLE.TASK_INSTANCE_ID;
    }
}
