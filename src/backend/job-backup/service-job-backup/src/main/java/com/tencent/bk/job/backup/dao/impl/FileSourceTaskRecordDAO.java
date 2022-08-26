package com.tencent.bk.job.backup.dao.impl;

import com.tencent.bk.job.backup.config.ArchiveConfig;
import org.jooq.DSLContext;
import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.generated.tables.FileSourceTaskLog;
import org.jooq.generated.tables.records.FileSourceTaskLogRecord;

import java.util.Arrays;
import java.util.List;

/**
 * file_source_task DAO
 */
public class FileSourceTaskRecordDAO extends AbstractExecuteRecordDAO<FileSourceTaskLogRecord> {

    private static final FileSourceTaskLog TABLE = FileSourceTaskLog.FILE_SOURCE_TASK_LOG;

    private static final List<Field<?>> FIELDS =
        Arrays.asList(
            TABLE.STEP_INSTANCE_ID,
            TABLE.EXECUTE_COUNT,
            TABLE.START_TIME,
            TABLE.END_TIME,
            TABLE.TOTAL_TIME,
            TABLE.STATUS,
            TABLE.FILE_SOURCE_BATCH_TASK_ID,
            TABLE.ROW_CREATE_TIME,
            TABLE.ROW_UPDATE_TIME
        );

    public FileSourceTaskRecordDAO(DSLContext context, ArchiveConfig archiveConfig) {
        super(context, archiveConfig);
    }

    @Override
    public List<Field<?>> listFields() {
        return FIELDS;
    }

    @Override
    public Table<FileSourceTaskLogRecord> getTable() {
        return TABLE;
    }

    @Override
    public TableField<FileSourceTaskLogRecord, Long> getArchiveIdField() {
        return TABLE.STEP_INSTANCE_ID;
    }
}
