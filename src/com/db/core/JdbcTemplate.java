package com.db.core;

import java.sql.*;

public class JdbcTemplate {

    /**
     * 執行查詢SQL
     * @param pscreator 建立SQL語句
     * @param callbackHandler 迴圈結果處理
     * @throws DataAccessException
     */
    public void query(PreparedStatementCreator pscreator,
                      RowCallbackHandler callbackHandler) throws DataAccessException {

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = DBHelp.getConnection();
            preparedStatement = pscreator.createPreparedStatement(connection);
            resultSet = preparedStatement.executeQuery();

            //遍歷迴圈
            while (resultSet.next()) {
                callbackHandler.processRow(resultSet);
            }

        } catch (SQLException e) {
            throw new DataAccessException("JdbcTemplate中的QLException", e);
        } catch (ClassNotFoundException e) {
            throw new DataAccessException("JdbcTemplate中的lassNotFoundException", e);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    throw new DataAccessException("JdbcTemplate中不能關閉資料庫連接", e);
                }
            }

            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    throw new DataAccessException("JdbcTemplate中不能釋放SQL語句", e);
                }
            }

            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    throw new DataAccessException("JdbcTemplate中不能關閉遍歷迴圈", e);
                }
            }
        }

    }

    /**
     * 資料庫修改操作
     * @param pscreator 建立SQL語句
     * @throws DataAccessException
     */
    public void update(PreparedStatementCreator pscreator)
            throws DataAccessException {

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DBHelp.getConnection();
            preparedStatement = pscreator.createPreparedStatement(connection);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new DataAccessException("JdbcTemplate中的QLException", e);
        } catch (ClassNotFoundException e) {
            throw new DataAccessException("JdbcTemplate中的lassNotFoundException", e);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    throw new DataAccessException("JdbcTemplate中不能關閉資料庫連接", e);
                }
            }

            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    throw new DataAccessException("JdbcTemplate中不能釋放SQL語句", e);
                }
            }
        }
    }
}
