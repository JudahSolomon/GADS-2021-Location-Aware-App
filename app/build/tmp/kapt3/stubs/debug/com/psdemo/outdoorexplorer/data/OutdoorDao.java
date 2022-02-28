package com.psdemo.outdoorexplorer.data;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0003H\'J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\b0\u0003H\'J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0006H\'J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\u0006\u0010\r\u001a\u00020\u0006H\'J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\'J\u0016\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\bH\'J\u0016\u0010\u0014\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\bH\'J\u0016\u0010\u0017\u001a\u00020\u00122\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\'J\u0010\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0006H\'\u00a8\u0006\u001b"}, d2 = {"Lcom/psdemo/outdoorexplorer/data/OutdoorDao;", "", "getActivityWithLocations", "Landroidx/lifecycle/LiveData;", "Lcom/psdemo/outdoorexplorer/data/ActivityWithLocations;", "activityId", "", "getAllActivities", "", "Lcom/psdemo/outdoorexplorer/data/Activity;", "getAllLocations", "Lcom/psdemo/outdoorexplorer/data/Location;", "getLocationById", "locationId", "getLocationWithActivities", "Lcom/psdemo/outdoorexplorer/data/LocationWithActivities;", "getLocationsForGeofencing", "insertActivities", "", "activities", "insertActivityLocationCrossRefs", "activityLocationCrossRefs", "Lcom/psdemo/outdoorexplorer/data/ActivityLocationCrossRef;", "insertLocations", "locations", "toggleGeofenceEnabled", "id", "app_debug"})
public abstract interface OutdoorDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertLocations(@org.jetbrains.annotations.NotNull()
    java.util.List<com.psdemo.outdoorexplorer.data.Location> locations);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertActivities(@org.jetbrains.annotations.NotNull()
    java.util.List<com.psdemo.outdoorexplorer.data.Activity> activities);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertActivityLocationCrossRefs(@org.jetbrains.annotations.NotNull()
    java.util.List<com.psdemo.outdoorexplorer.data.ActivityLocationCrossRef> activityLocationCrossRefs);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM Activity ORDER BY title")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.psdemo.outdoorexplorer.data.Activity>> getAllActivities();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM Location")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.psdemo.outdoorexplorer.data.Location>> getAllLocations();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM Activity WHERE activityId = :activityId")
    @androidx.room.Transaction()
    public abstract androidx.lifecycle.LiveData<com.psdemo.outdoorexplorer.data.ActivityWithLocations> getActivityWithLocations(int activityId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM Location WHERE locationId = :locationId")
    public abstract com.psdemo.outdoorexplorer.data.Location getLocationById(int locationId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT DISTINCT L.* FROM Location L, Activity A, ActivityLocationCrossRef AL WHERE L.locationId = AL.locationId AND AL.activityId = A.activityId AND A.geofenceEnabled != 0")
    @androidx.room.Transaction()
    public abstract java.util.List<com.psdemo.outdoorexplorer.data.Location> getLocationsForGeofencing();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM Location WHERE locationId = :locationId")
    @androidx.room.Transaction()
    public abstract androidx.lifecycle.LiveData<com.psdemo.outdoorexplorer.data.LocationWithActivities> getLocationWithActivities(int locationId);
    
    @androidx.room.Query(value = "UPDATE activity set geofenceEnabled = ~geofenceEnabled WHERE activityId = :id")
    public abstract int toggleGeofenceEnabled(int id);
}