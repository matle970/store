package com.db.core;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 處理遍歷迴圈結果
 */
public interface RowCallbackHandler {
    void processRow(ResultSet rs) throws SQLException;
}
