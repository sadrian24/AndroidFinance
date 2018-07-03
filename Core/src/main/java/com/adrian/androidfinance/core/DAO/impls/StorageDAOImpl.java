package com.adrian.androidfinance.core.DAO.impls;

import com.adrian.androidfinance.core.DAO.interfaces.StorageDAO;
import com.adrian.androidfinance.core.database.SQLiteConnection;
import com.adrian.androidfinance.core.interfaces.Storage;
import com.adrian.androidfinance.core.interfaces.TreeNode;
import com.adrian.androidfinance.core.utils.TreeConstructor;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StorageDAOImpl implements StorageDAO {

    private static final String CURRENCY_TABLE = "currency_amount";
    private static final String STORAGE_TABLE = "storage";

    private TreeConstructor<Storage> treeConstructor = new TreeConstructor<>();

    private List<Storage> storageList = new ArrayList<>();

    @Override
    public boolean addCurrency(Storage storage, Currency currency) {

        try (PreparedStatement stmt = SQLiteConnection.getConnection().prepareStatement("instert into " + CURRENCY_TABLE + "(currency_code, storage_id, amount) values(?,?,?)");) {
            stmt.setString(1, currency.getCurrencyCode());
            stmt.setLong(2, storage.getId());
            stmt.setBigDecimal(3, BigDecimal.ZERO);

            if (stmt.executeUpdate() == 1) {
                return true;
            }
        } catch (SQLException e) {
            Logger.getLogger(StorageDAOImpl.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }

    @Override
    public boolean deleteCurrency(Storage storage, Currency currency) {
        return false;
    }

    @Override
    public boolean updateCurrency(Storage storage, BigDecimal amount) {
        return false;
    }

    @Override
    public List<Storage> getAll() {
        return null;
    }

    @Override
    public Storage get(long id) {
        return null;
    }

    @Override
    public boolean update(Storage storage) {
        return false;
    }

    @Override
    public boolean delete(Storage storage) {
        return false;
    }
}
