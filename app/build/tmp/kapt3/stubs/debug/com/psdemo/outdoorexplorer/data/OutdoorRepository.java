package com.psdemo.outdoorexplorer.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0003H&J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\b0\u0003H&J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0006H&J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\u0006\u0010\r\u001a\u00020\u0006H&J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0006H&\u00a8\u0006\u0013"}, d2 = {"Lcom/psdemo/outdoorexplorer/data/OutdoorRepository;", "", "getActivityWithLocations", "Landroidx/lifecycle/LiveData;", "Lcom/psdemo/outdoorexplorer/data/ActivityWithLocations;", "activityId", "", "getAllActivities", "", "Lcom/psdemo/outdoorexplorer/data/Activity;", "getAllLocations", "Lcom/psdemo/outdoorexplorer/data/Location;", "getLocationById", "locationId", "getLocationWithActivities", "Lcom/psdemo/outdoorexplorer/data/LocationWithActivities;", "toggleActivityGeofence", "Lcom/psdemo/outdoorexplorer/data/GeofencingChanges;", "id", "app_debug"})
public abstract interface OutdoorRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.psdemo.outdoorexplorer.data.Activity>> getAllActivities();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.psdemo.outdoorexplorer.data.Location>> getAllLocations();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<com.psdemo.outdoorexplorer.data.ActivityWithLocations> getActivityWithLocations(int activityId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.psdemo.outdoorexplorer.data.Location getLocationById(int locationId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<com.psdemo.outdoorexplorer.data.LocationWithActivities> getLocationWithActivities(int locationId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.psdemo.outdoorexplorer.data.GeofencingChanges toggleActivityGeofence(int id);
}