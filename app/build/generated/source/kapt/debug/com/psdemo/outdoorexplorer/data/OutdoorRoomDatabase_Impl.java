package com.psdemo.outdoorexplorer.data;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class OutdoorRoomDatabase_Impl extends OutdoorRoomDatabase {
  private volatile OutdoorDao _outdoorDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Activity` (`activityId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `title` TEXT NOT NULL, `icon` TEXT NOT NULL, `geofenceEnabled` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Location` (`locationId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `title` TEXT NOT NULL, `description` TEXT NOT NULL, `hours` TEXT NOT NULL, `latitude` REAL NOT NULL, `longitude` REAL NOT NULL, `geofenceRadius` REAL NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `ActivityLocationCrossRef` (`activityId` INTEGER NOT NULL, `locationId` INTEGER NOT NULL, PRIMARY KEY(`activityId`, `locationId`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c5d7bf5d920347fb6bc9888a83d7718d')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `Activity`");
        _db.execSQL("DROP TABLE IF EXISTS `Location`");
        _db.execSQL("DROP TABLE IF EXISTS `ActivityLocationCrossRef`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsActivity = new HashMap<String, TableInfo.Column>(4);
        _columnsActivity.put("activityId", new TableInfo.Column("activityId", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsActivity.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsActivity.put("icon", new TableInfo.Column("icon", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsActivity.put("geofenceEnabled", new TableInfo.Column("geofenceEnabled", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysActivity = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesActivity = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoActivity = new TableInfo("Activity", _columnsActivity, _foreignKeysActivity, _indicesActivity);
        final TableInfo _existingActivity = TableInfo.read(_db, "Activity");
        if (! _infoActivity.equals(_existingActivity)) {
          return new RoomOpenHelper.ValidationResult(false, "Activity(com.psdemo.outdoorexplorer.data.Activity).\n"
                  + " Expected:\n" + _infoActivity + "\n"
                  + " Found:\n" + _existingActivity);
        }
        final HashMap<String, TableInfo.Column> _columnsLocation = new HashMap<String, TableInfo.Column>(7);
        _columnsLocation.put("locationId", new TableInfo.Column("locationId", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLocation.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLocation.put("description", new TableInfo.Column("description", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLocation.put("hours", new TableInfo.Column("hours", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLocation.put("latitude", new TableInfo.Column("latitude", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLocation.put("longitude", new TableInfo.Column("longitude", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLocation.put("geofenceRadius", new TableInfo.Column("geofenceRadius", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysLocation = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesLocation = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoLocation = new TableInfo("Location", _columnsLocation, _foreignKeysLocation, _indicesLocation);
        final TableInfo _existingLocation = TableInfo.read(_db, "Location");
        if (! _infoLocation.equals(_existingLocation)) {
          return new RoomOpenHelper.ValidationResult(false, "Location(com.psdemo.outdoorexplorer.data.Location).\n"
                  + " Expected:\n" + _infoLocation + "\n"
                  + " Found:\n" + _existingLocation);
        }
        final HashMap<String, TableInfo.Column> _columnsActivityLocationCrossRef = new HashMap<String, TableInfo.Column>(2);
        _columnsActivityLocationCrossRef.put("activityId", new TableInfo.Column("activityId", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsActivityLocationCrossRef.put("locationId", new TableInfo.Column("locationId", "INTEGER", true, 2, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysActivityLocationCrossRef = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesActivityLocationCrossRef = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoActivityLocationCrossRef = new TableInfo("ActivityLocationCrossRef", _columnsActivityLocationCrossRef, _foreignKeysActivityLocationCrossRef, _indicesActivityLocationCrossRef);
        final TableInfo _existingActivityLocationCrossRef = TableInfo.read(_db, "ActivityLocationCrossRef");
        if (! _infoActivityLocationCrossRef.equals(_existingActivityLocationCrossRef)) {
          return new RoomOpenHelper.ValidationResult(false, "ActivityLocationCrossRef(com.psdemo.outdoorexplorer.data.ActivityLocationCrossRef).\n"
                  + " Expected:\n" + _infoActivityLocationCrossRef + "\n"
                  + " Found:\n" + _existingActivityLocationCrossRef);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "c5d7bf5d920347fb6bc9888a83d7718d", "f769650e45278b3c15d0f190a3146506");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "Activity","Location","ActivityLocationCrossRef");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `Activity`");
      _db.execSQL("DELETE FROM `Location`");
      _db.execSQL("DELETE FROM `ActivityLocationCrossRef`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public OutdoorDao outdoorDao() {
    if (_outdoorDao != null) {
      return _outdoorDao;
    } else {
      synchronized(this) {
        if(_outdoorDao == null) {
          _outdoorDao = new OutdoorDao_Impl(this);
        }
        return _outdoorDao;
      }
    }
  }
}
