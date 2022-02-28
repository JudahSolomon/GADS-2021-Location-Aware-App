package com.psdemo.outdoorexplorer.data;

import android.database.Cursor;
import androidx.collection.LongSparseArray;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class OutdoorDao_Impl implements OutdoorDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Location> __insertionAdapterOfLocation;

  private final EntityInsertionAdapter<Activity> __insertionAdapterOfActivity;

  private final EntityInsertionAdapter<ActivityLocationCrossRef> __insertionAdapterOfActivityLocationCrossRef;

  private final SharedSQLiteStatement __preparedStmtOfToggleGeofenceEnabled;

  public OutdoorDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfLocation = new EntityInsertionAdapter<Location>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Location` (`locationId`,`title`,`description`,`hours`,`latitude`,`longitude`,`geofenceRadius`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Location value) {
        stmt.bindLong(1, value.getLocationId());
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDescription());
        }
        if (value.getHours() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getHours());
        }
        stmt.bindDouble(5, value.getLatitude());
        stmt.bindDouble(6, value.getLongitude());
        stmt.bindDouble(7, value.getGeofenceRadius());
      }
    };
    this.__insertionAdapterOfActivity = new EntityInsertionAdapter<Activity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Activity` (`activityId`,`title`,`icon`,`geofenceEnabled`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Activity value) {
        stmt.bindLong(1, value.getActivityId());
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getIcon() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getIcon());
        }
        final int _tmp;
        _tmp = value.getGeofenceEnabled() ? 1 : 0;
        stmt.bindLong(4, _tmp);
      }
    };
    this.__insertionAdapterOfActivityLocationCrossRef = new EntityInsertionAdapter<ActivityLocationCrossRef>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `ActivityLocationCrossRef` (`activityId`,`locationId`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ActivityLocationCrossRef value) {
        stmt.bindLong(1, value.getActivityId());
        stmt.bindLong(2, value.getLocationId());
      }
    };
    this.__preparedStmtOfToggleGeofenceEnabled = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE activity set geofenceEnabled = ~geofenceEnabled WHERE activityId = ?";
        return _query;
      }
    };
  }

  @Override
  public void insertLocations(final List<Location> locations) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfLocation.insert(locations);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertActivities(final List<Activity> activities) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfActivity.insert(activities);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertActivityLocationCrossRefs(final List<ActivityLocationCrossRef> activityLocationCrossRefs) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfActivityLocationCrossRef.insert(activityLocationCrossRefs);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int toggleGeofenceEnabled(final int id) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfToggleGeofenceEnabled.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, id);
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfToggleGeofenceEnabled.release(_stmt);
    }
  }

  @Override
  public LiveData<List<Activity>> getAllActivities() {
    final String _sql = "SELECT * FROM Activity ORDER BY title";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"Activity"}, false, new Callable<List<Activity>>() {
      @Override
      public List<Activity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfActivityId = CursorUtil.getColumnIndexOrThrow(_cursor, "activityId");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfIcon = CursorUtil.getColumnIndexOrThrow(_cursor, "icon");
          final int _cursorIndexOfGeofenceEnabled = CursorUtil.getColumnIndexOrThrow(_cursor, "geofenceEnabled");
          final List<Activity> _result = new ArrayList<Activity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Activity _item;
            final int _tmpActivityId;
            _tmpActivityId = _cursor.getInt(_cursorIndexOfActivityId);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final String _tmpIcon;
            _tmpIcon = _cursor.getString(_cursorIndexOfIcon);
            final boolean _tmpGeofenceEnabled;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfGeofenceEnabled);
            _tmpGeofenceEnabled = _tmp != 0;
            _item = new Activity(_tmpActivityId,_tmpTitle,_tmpIcon,_tmpGeofenceEnabled);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<Location>> getAllLocations() {
    final String _sql = "SELECT * FROM Location";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"Location"}, false, new Callable<List<Location>>() {
      @Override
      public List<Location> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfLocationId = CursorUtil.getColumnIndexOrThrow(_cursor, "locationId");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfHours = CursorUtil.getColumnIndexOrThrow(_cursor, "hours");
          final int _cursorIndexOfLatitude = CursorUtil.getColumnIndexOrThrow(_cursor, "latitude");
          final int _cursorIndexOfLongitude = CursorUtil.getColumnIndexOrThrow(_cursor, "longitude");
          final int _cursorIndexOfGeofenceRadius = CursorUtil.getColumnIndexOrThrow(_cursor, "geofenceRadius");
          final List<Location> _result = new ArrayList<Location>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Location _item;
            final int _tmpLocationId;
            _tmpLocationId = _cursor.getInt(_cursorIndexOfLocationId);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final String _tmpHours;
            _tmpHours = _cursor.getString(_cursorIndexOfHours);
            final double _tmpLatitude;
            _tmpLatitude = _cursor.getDouble(_cursorIndexOfLatitude);
            final double _tmpLongitude;
            _tmpLongitude = _cursor.getDouble(_cursorIndexOfLongitude);
            final float _tmpGeofenceRadius;
            _tmpGeofenceRadius = _cursor.getFloat(_cursorIndexOfGeofenceRadius);
            _item = new Location(_tmpLocationId,_tmpTitle,_tmpDescription,_tmpHours,_tmpLatitude,_tmpLongitude,_tmpGeofenceRadius);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<ActivityWithLocations> getActivityWithLocations(final int activityId) {
    final String _sql = "SELECT * FROM Activity WHERE activityId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, activityId);
    return __db.getInvalidationTracker().createLiveData(new String[]{"ActivityLocationCrossRef","Location","Activity"}, true, new Callable<ActivityWithLocations>() {
      @Override
      public ActivityWithLocations call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
          try {
            final int _cursorIndexOfActivityId = CursorUtil.getColumnIndexOrThrow(_cursor, "activityId");
            final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
            final int _cursorIndexOfIcon = CursorUtil.getColumnIndexOrThrow(_cursor, "icon");
            final int _cursorIndexOfGeofenceEnabled = CursorUtil.getColumnIndexOrThrow(_cursor, "geofenceEnabled");
            final LongSparseArray<ArrayList<Location>> _collectionLocations = new LongSparseArray<ArrayList<Location>>();
            while (_cursor.moveToNext()) {
              final long _tmpKey = _cursor.getLong(_cursorIndexOfActivityId);
              ArrayList<Location> _tmpLocationsCollection = _collectionLocations.get(_tmpKey);
              if (_tmpLocationsCollection == null) {
                _tmpLocationsCollection = new ArrayList<Location>();
                _collectionLocations.put(_tmpKey, _tmpLocationsCollection);
              }
            }
            _cursor.moveToPosition(-1);
            __fetchRelationshipLocationAscomPsdemoOutdoorexplorerDataLocation(_collectionLocations);
            final ActivityWithLocations _result;
            if(_cursor.moveToFirst()) {
              final Activity _tmpActivity;
              if (! (_cursor.isNull(_cursorIndexOfActivityId) && _cursor.isNull(_cursorIndexOfTitle) && _cursor.isNull(_cursorIndexOfIcon) && _cursor.isNull(_cursorIndexOfGeofenceEnabled))) {
                final int _tmpActivityId;
                _tmpActivityId = _cursor.getInt(_cursorIndexOfActivityId);
                final String _tmpTitle;
                _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
                final String _tmpIcon;
                _tmpIcon = _cursor.getString(_cursorIndexOfIcon);
                final boolean _tmpGeofenceEnabled;
                final int _tmp;
                _tmp = _cursor.getInt(_cursorIndexOfGeofenceEnabled);
                _tmpGeofenceEnabled = _tmp != 0;
                _tmpActivity = new Activity(_tmpActivityId,_tmpTitle,_tmpIcon,_tmpGeofenceEnabled);
              }  else  {
                _tmpActivity = null;
              }
              ArrayList<Location> _tmpLocationsCollection_1 = null;
              final long _tmpKey_1 = _cursor.getLong(_cursorIndexOfActivityId);
              _tmpLocationsCollection_1 = _collectionLocations.get(_tmpKey_1);
              if (_tmpLocationsCollection_1 == null) {
                _tmpLocationsCollection_1 = new ArrayList<Location>();
              }
              _result = new ActivityWithLocations(_tmpActivity,_tmpLocationsCollection_1);
            } else {
              _result = null;
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
          }
        } finally {
          __db.endTransaction();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Location getLocationById(final int locationId) {
    final String _sql = "SELECT * FROM Location WHERE locationId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, locationId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfLocationId = CursorUtil.getColumnIndexOrThrow(_cursor, "locationId");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfHours = CursorUtil.getColumnIndexOrThrow(_cursor, "hours");
      final int _cursorIndexOfLatitude = CursorUtil.getColumnIndexOrThrow(_cursor, "latitude");
      final int _cursorIndexOfLongitude = CursorUtil.getColumnIndexOrThrow(_cursor, "longitude");
      final int _cursorIndexOfGeofenceRadius = CursorUtil.getColumnIndexOrThrow(_cursor, "geofenceRadius");
      final Location _result;
      if(_cursor.moveToFirst()) {
        final int _tmpLocationId;
        _tmpLocationId = _cursor.getInt(_cursorIndexOfLocationId);
        final String _tmpTitle;
        _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        final String _tmpDescription;
        _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        final String _tmpHours;
        _tmpHours = _cursor.getString(_cursorIndexOfHours);
        final double _tmpLatitude;
        _tmpLatitude = _cursor.getDouble(_cursorIndexOfLatitude);
        final double _tmpLongitude;
        _tmpLongitude = _cursor.getDouble(_cursorIndexOfLongitude);
        final float _tmpGeofenceRadius;
        _tmpGeofenceRadius = _cursor.getFloat(_cursorIndexOfGeofenceRadius);
        _result = new Location(_tmpLocationId,_tmpTitle,_tmpDescription,_tmpHours,_tmpLatitude,_tmpLongitude,_tmpGeofenceRadius);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<Location> getLocationsForGeofencing() {
    final String _sql = "SELECT DISTINCT L.* FROM Location L, Activity A, ActivityLocationCrossRef AL WHERE L.locationId = AL.locationId AND AL.activityId = A.activityId AND A.geofenceEnabled != 0";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
      try {
        final int _cursorIndexOfLocationId = CursorUtil.getColumnIndexOrThrow(_cursor, "locationId");
        final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
        final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
        final int _cursorIndexOfHours = CursorUtil.getColumnIndexOrThrow(_cursor, "hours");
        final int _cursorIndexOfLatitude = CursorUtil.getColumnIndexOrThrow(_cursor, "latitude");
        final int _cursorIndexOfLongitude = CursorUtil.getColumnIndexOrThrow(_cursor, "longitude");
        final int _cursorIndexOfGeofenceRadius = CursorUtil.getColumnIndexOrThrow(_cursor, "geofenceRadius");
        final List<Location> _result = new ArrayList<Location>(_cursor.getCount());
        while(_cursor.moveToNext()) {
          final Location _item;
          final int _tmpLocationId;
          _tmpLocationId = _cursor.getInt(_cursorIndexOfLocationId);
          final String _tmpTitle;
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
          final String _tmpDescription;
          _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
          final String _tmpHours;
          _tmpHours = _cursor.getString(_cursorIndexOfHours);
          final double _tmpLatitude;
          _tmpLatitude = _cursor.getDouble(_cursorIndexOfLatitude);
          final double _tmpLongitude;
          _tmpLongitude = _cursor.getDouble(_cursorIndexOfLongitude);
          final float _tmpGeofenceRadius;
          _tmpGeofenceRadius = _cursor.getFloat(_cursorIndexOfGeofenceRadius);
          _item = new Location(_tmpLocationId,_tmpTitle,_tmpDescription,_tmpHours,_tmpLatitude,_tmpLongitude,_tmpGeofenceRadius);
          _result.add(_item);
        }
        __db.setTransactionSuccessful();
        return _result;
      } finally {
        _cursor.close();
        _statement.release();
      }
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<LocationWithActivities> getLocationWithActivities(final int locationId) {
    final String _sql = "SELECT * FROM Location WHERE locationId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, locationId);
    return __db.getInvalidationTracker().createLiveData(new String[]{"ActivityLocationCrossRef","Activity","Location"}, true, new Callable<LocationWithActivities>() {
      @Override
      public LocationWithActivities call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
          try {
            final int _cursorIndexOfLocationId = CursorUtil.getColumnIndexOrThrow(_cursor, "locationId");
            final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
            final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
            final int _cursorIndexOfHours = CursorUtil.getColumnIndexOrThrow(_cursor, "hours");
            final int _cursorIndexOfLatitude = CursorUtil.getColumnIndexOrThrow(_cursor, "latitude");
            final int _cursorIndexOfLongitude = CursorUtil.getColumnIndexOrThrow(_cursor, "longitude");
            final int _cursorIndexOfGeofenceRadius = CursorUtil.getColumnIndexOrThrow(_cursor, "geofenceRadius");
            final LongSparseArray<ArrayList<Activity>> _collectionActivities = new LongSparseArray<ArrayList<Activity>>();
            while (_cursor.moveToNext()) {
              final long _tmpKey = _cursor.getLong(_cursorIndexOfLocationId);
              ArrayList<Activity> _tmpActivitiesCollection = _collectionActivities.get(_tmpKey);
              if (_tmpActivitiesCollection == null) {
                _tmpActivitiesCollection = new ArrayList<Activity>();
                _collectionActivities.put(_tmpKey, _tmpActivitiesCollection);
              }
            }
            _cursor.moveToPosition(-1);
            __fetchRelationshipActivityAscomPsdemoOutdoorexplorerDataActivity(_collectionActivities);
            final LocationWithActivities _result;
            if(_cursor.moveToFirst()) {
              final Location _tmpLocation;
              if (! (_cursor.isNull(_cursorIndexOfLocationId) && _cursor.isNull(_cursorIndexOfTitle) && _cursor.isNull(_cursorIndexOfDescription) && _cursor.isNull(_cursorIndexOfHours) && _cursor.isNull(_cursorIndexOfLatitude) && _cursor.isNull(_cursorIndexOfLongitude) && _cursor.isNull(_cursorIndexOfGeofenceRadius))) {
                final int _tmpLocationId;
                _tmpLocationId = _cursor.getInt(_cursorIndexOfLocationId);
                final String _tmpTitle;
                _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
                final String _tmpDescription;
                _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
                final String _tmpHours;
                _tmpHours = _cursor.getString(_cursorIndexOfHours);
                final double _tmpLatitude;
                _tmpLatitude = _cursor.getDouble(_cursorIndexOfLatitude);
                final double _tmpLongitude;
                _tmpLongitude = _cursor.getDouble(_cursorIndexOfLongitude);
                final float _tmpGeofenceRadius;
                _tmpGeofenceRadius = _cursor.getFloat(_cursorIndexOfGeofenceRadius);
                _tmpLocation = new Location(_tmpLocationId,_tmpTitle,_tmpDescription,_tmpHours,_tmpLatitude,_tmpLongitude,_tmpGeofenceRadius);
              }  else  {
                _tmpLocation = null;
              }
              ArrayList<Activity> _tmpActivitiesCollection_1 = null;
              final long _tmpKey_1 = _cursor.getLong(_cursorIndexOfLocationId);
              _tmpActivitiesCollection_1 = _collectionActivities.get(_tmpKey_1);
              if (_tmpActivitiesCollection_1 == null) {
                _tmpActivitiesCollection_1 = new ArrayList<Activity>();
              }
              _result = new LocationWithActivities(_tmpLocation,_tmpActivitiesCollection_1);
            } else {
              _result = null;
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
          }
        } finally {
          __db.endTransaction();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  private void __fetchRelationshipLocationAscomPsdemoOutdoorexplorerDataLocation(final LongSparseArray<ArrayList<Location>> _map) {
    if (_map.isEmpty()) {
      return;
    }
    // check if the size is too big, if so divide;
    if(_map.size() > RoomDatabase.MAX_BIND_PARAMETER_CNT) {
      LongSparseArray<ArrayList<Location>> _tmpInnerMap = new LongSparseArray<ArrayList<Location>>(androidx.room.RoomDatabase.MAX_BIND_PARAMETER_CNT);
      int _tmpIndex = 0;
      int _mapIndex = 0;
      final int _limit = _map.size();
      while(_mapIndex < _limit) {
        _tmpInnerMap.put(_map.keyAt(_mapIndex), _map.valueAt(_mapIndex));
        _mapIndex++;
        _tmpIndex++;
        if(_tmpIndex == RoomDatabase.MAX_BIND_PARAMETER_CNT) {
          __fetchRelationshipLocationAscomPsdemoOutdoorexplorerDataLocation(_tmpInnerMap);
          _tmpInnerMap = new LongSparseArray<ArrayList<Location>>(RoomDatabase.MAX_BIND_PARAMETER_CNT);
          _tmpIndex = 0;
        }
      }
      if(_tmpIndex > 0) {
        __fetchRelationshipLocationAscomPsdemoOutdoorexplorerDataLocation(_tmpInnerMap);
      }
      return;
    }
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT `Location`.`locationId` AS `locationId`,`Location`.`title` AS `title`,`Location`.`description` AS `description`,`Location`.`hours` AS `hours`,`Location`.`latitude` AS `latitude`,`Location`.`longitude` AS `longitude`,`Location`.`geofenceRadius` AS `geofenceRadius`,_junction.`activityId` FROM `ActivityLocationCrossRef` AS _junction INNER JOIN `Location` ON (_junction.`locationId` = `Location`.`locationId`) WHERE _junction.`activityId` IN (");
    final int _inputSize = _map.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _stmt = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (int i = 0; i < _map.size(); i++) {
      long _item = _map.keyAt(i);
      _stmt.bindLong(_argIndex, _item);
      _argIndex ++;
    }
    final Cursor _cursor = DBUtil.query(__db, _stmt, false, null);
    try {
      final int _itemKeyIndex = 7; // _junction.activityId;
      if (_itemKeyIndex == -1) {
        return;
      }
      final int _cursorIndexOfLocationId = CursorUtil.getColumnIndex(_cursor, "locationId");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndex(_cursor, "title");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndex(_cursor, "description");
      final int _cursorIndexOfHours = CursorUtil.getColumnIndex(_cursor, "hours");
      final int _cursorIndexOfLatitude = CursorUtil.getColumnIndex(_cursor, "latitude");
      final int _cursorIndexOfLongitude = CursorUtil.getColumnIndex(_cursor, "longitude");
      final int _cursorIndexOfGeofenceRadius = CursorUtil.getColumnIndex(_cursor, "geofenceRadius");
      while(_cursor.moveToNext()) {
        final long _tmpKey = _cursor.getLong(_itemKeyIndex);
        ArrayList<Location> _tmpRelation = _map.get(_tmpKey);
        if (_tmpRelation != null) {
          final Location _item_1;
          final int _tmpLocationId;
          if (_cursorIndexOfLocationId == -1) {
            _tmpLocationId = 0;
          } else {
            _tmpLocationId = _cursor.getInt(_cursorIndexOfLocationId);
          }
          final String _tmpTitle;
          if (_cursorIndexOfTitle == -1) {
            _tmpTitle = null;
          } else {
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
          }
          final String _tmpDescription;
          if (_cursorIndexOfDescription == -1) {
            _tmpDescription = null;
          } else {
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
          }
          final String _tmpHours;
          if (_cursorIndexOfHours == -1) {
            _tmpHours = null;
          } else {
            _tmpHours = _cursor.getString(_cursorIndexOfHours);
          }
          final double _tmpLatitude;
          if (_cursorIndexOfLatitude == -1) {
            _tmpLatitude = 0;
          } else {
            _tmpLatitude = _cursor.getDouble(_cursorIndexOfLatitude);
          }
          final double _tmpLongitude;
          if (_cursorIndexOfLongitude == -1) {
            _tmpLongitude = 0;
          } else {
            _tmpLongitude = _cursor.getDouble(_cursorIndexOfLongitude);
          }
          final float _tmpGeofenceRadius;
          if (_cursorIndexOfGeofenceRadius == -1) {
            _tmpGeofenceRadius = 0;
          } else {
            _tmpGeofenceRadius = _cursor.getFloat(_cursorIndexOfGeofenceRadius);
          }
          _item_1 = new Location(_tmpLocationId,_tmpTitle,_tmpDescription,_tmpHours,_tmpLatitude,_tmpLongitude,_tmpGeofenceRadius);
          _tmpRelation.add(_item_1);
        }
      }
    } finally {
      _cursor.close();
    }
  }

  private void __fetchRelationshipActivityAscomPsdemoOutdoorexplorerDataActivity(final LongSparseArray<ArrayList<Activity>> _map) {
    if (_map.isEmpty()) {
      return;
    }
    // check if the size is too big, if so divide;
    if(_map.size() > RoomDatabase.MAX_BIND_PARAMETER_CNT) {
      LongSparseArray<ArrayList<Activity>> _tmpInnerMap = new LongSparseArray<ArrayList<Activity>>(androidx.room.RoomDatabase.MAX_BIND_PARAMETER_CNT);
      int _tmpIndex = 0;
      int _mapIndex = 0;
      final int _limit = _map.size();
      while(_mapIndex < _limit) {
        _tmpInnerMap.put(_map.keyAt(_mapIndex), _map.valueAt(_mapIndex));
        _mapIndex++;
        _tmpIndex++;
        if(_tmpIndex == RoomDatabase.MAX_BIND_PARAMETER_CNT) {
          __fetchRelationshipActivityAscomPsdemoOutdoorexplorerDataActivity(_tmpInnerMap);
          _tmpInnerMap = new LongSparseArray<ArrayList<Activity>>(RoomDatabase.MAX_BIND_PARAMETER_CNT);
          _tmpIndex = 0;
        }
      }
      if(_tmpIndex > 0) {
        __fetchRelationshipActivityAscomPsdemoOutdoorexplorerDataActivity(_tmpInnerMap);
      }
      return;
    }
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT `Activity`.`activityId` AS `activityId`,`Activity`.`title` AS `title`,`Activity`.`icon` AS `icon`,`Activity`.`geofenceEnabled` AS `geofenceEnabled`,_junction.`locationId` FROM `ActivityLocationCrossRef` AS _junction INNER JOIN `Activity` ON (_junction.`activityId` = `Activity`.`activityId`) WHERE _junction.`locationId` IN (");
    final int _inputSize = _map.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _stmt = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (int i = 0; i < _map.size(); i++) {
      long _item = _map.keyAt(i);
      _stmt.bindLong(_argIndex, _item);
      _argIndex ++;
    }
    final Cursor _cursor = DBUtil.query(__db, _stmt, false, null);
    try {
      final int _itemKeyIndex = 4; // _junction.locationId;
      if (_itemKeyIndex == -1) {
        return;
      }
      final int _cursorIndexOfActivityId = CursorUtil.getColumnIndex(_cursor, "activityId");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndex(_cursor, "title");
      final int _cursorIndexOfIcon = CursorUtil.getColumnIndex(_cursor, "icon");
      final int _cursorIndexOfGeofenceEnabled = CursorUtil.getColumnIndex(_cursor, "geofenceEnabled");
      while(_cursor.moveToNext()) {
        final long _tmpKey = _cursor.getLong(_itemKeyIndex);
        ArrayList<Activity> _tmpRelation = _map.get(_tmpKey);
        if (_tmpRelation != null) {
          final Activity _item_1;
          final int _tmpActivityId;
          if (_cursorIndexOfActivityId == -1) {
            _tmpActivityId = 0;
          } else {
            _tmpActivityId = _cursor.getInt(_cursorIndexOfActivityId);
          }
          final String _tmpTitle;
          if (_cursorIndexOfTitle == -1) {
            _tmpTitle = null;
          } else {
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
          }
          final String _tmpIcon;
          if (_cursorIndexOfIcon == -1) {
            _tmpIcon = null;
          } else {
            _tmpIcon = _cursor.getString(_cursorIndexOfIcon);
          }
          final boolean _tmpGeofenceEnabled;
          if (_cursorIndexOfGeofenceEnabled == -1) {
            _tmpGeofenceEnabled = false;
          } else {
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfGeofenceEnabled);
            _tmpGeofenceEnabled = _tmp != 0;
          }
          _item_1 = new Activity(_tmpActivityId,_tmpTitle,_tmpIcon,_tmpGeofenceEnabled);
          _tmpRelation.add(_item_1);
        }
      }
    } finally {
      _cursor.close();
    }
  }
}
