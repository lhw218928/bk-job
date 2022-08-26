package com.tencent.bk.job.backup.dao.impl;

import com.tencent.bk.job.backup.config.ArchiveConfig;
import org.jooq.DSLContext;
import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.generated.tables.GseTaskLog;
import org.jooq.generated.tables.records.GseTaskLogRecord;

import java.util.Arrays;
import java.util.List;

/**
 * gse_task_log DAO
 */
public class GseTaskLogRecordDAO extends AbstractExecuteRecordDAO<GseTaskLogRecord> {

    private static final GseTaskLog TABLE = GseTaskLog.GSE_TASK_LOG;

    private static final List<Field<?>> FIELDS =
        Arrays.asList(TABLE.STEP_INSTANCE_ID,
            TABLE.EXECUTE_COUNT,
            TABLE.START_TIME,
            TABLE.END_TIME,
            TABLE.TOTAL_TIME,
            TABLE.STATUS,
            TABLE.GSE_TASK_ID,
            TABLE.ROW_CREATE_TIME,
            TABLE.ROW_UPDATE_TIME
        );

    public GseTaskLogRecordDAO(DSLContext context, ArchiveConfig archiveConfig) {
        super(context, archiveConfig);
    }

    @Override
    public List<Field<?>> listFields() {
        return FIELDS;
    }

    @Override
    public Table<GseTaskLogRecord> getTable() {
        return TABLE;
    }

    @Override
    public TableField<GseTaskLogRecord, Long> getArchiveIdField() {
        return TABLE.STEP_INSTANCE_ID;
    }
}
