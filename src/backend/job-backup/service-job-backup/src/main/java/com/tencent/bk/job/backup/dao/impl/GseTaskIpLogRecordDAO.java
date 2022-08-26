package com.tencent.bk.job.backup.dao.impl;

import com.tencent.bk.job.backup.config.ArchiveConfig;
import org.jooq.DSLContext;
import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.generated.tables.GseTaskIpLog;
import org.jooq.generated.tables.records.GseTaskIpLogRecord;

import java.util.Arrays;
import java.util.List;

/**
 * gse_task_ip_log DAO
 */
public class GseTaskIpLogRecordDAO extends AbstractExecuteRecordDAO<GseTaskIpLogRecord> {

    private static final GseTaskIpLog TABLE = GseTaskIpLog.GSE_TASK_IP_LOG;

    private static final List<Field<?>> FIELDS =
        Arrays.asList(
            TABLE.STEP_INSTANCE_ID,
            TABLE.EXECUTE_COUNT,
            TABLE.IP,
            TABLE.STATUS,
            TABLE.START_TIME,
            TABLE.END_TIME,
            TABLE.TOTAL_TIME,
            TABLE.ERROR_CODE,
            TABLE.EXIT_CODE,
            TABLE.TAG,
            TABLE.LOG_OFFSET,
            TABLE.DISPLAY_IP,
            TABLE.IS_TARGET,
            TABLE.ROW_CREATE_TIME,
            TABLE.ROW_UPDATE_TIME,
            TABLE.IS_SOURCE
        );

    public GseTaskIpLogRecordDAO(DSLContext context, ArchiveConfig archiveConfig) {
        super(context, archiveConfig);
    }

    @Override
    public List<Field<?>> listFields() {
        return FIELDS;
    }

    @Override
    public Table<GseTaskIpLogRecord> getTable() {
        return TABLE;
    }

    @Override
    public TableField<GseTaskIpLogRecord, Long> getArchiveIdField() {
        return TABLE.STEP_INSTANCE_ID;
    }
}
