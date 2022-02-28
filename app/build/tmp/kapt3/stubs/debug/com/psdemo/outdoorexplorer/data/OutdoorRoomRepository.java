package com.psdemo.outdoorexplorer.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0006H\u0016J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000b0\u0006H\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\tH\u0016J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00062\u0006\u0010\u0010\u001a\u00020\tH\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/psdemo/outdoorexplorer/data/OutdoorRoomRepository;", "Lcom/psdemo/outdoorexplorer/data/OutdoorRepository;", "outdoorDao", "Lcom/psdemo/outdoorexplorer/data/OutdoorDao;", "(Lcom/psdemo/outdoorexplorer/data/OutdoorDao;)V", "getActivityWithLocations", "Landroidx/lifecycle/LiveData;", "Lcom/psdemo/outdoorexplorer/data/ActivityWithLocations;", "activityId", "", "getAllActivities", "", "Lcom/psdemo/outdoorexplorer/data/Activity;", "getAllLocations", "Lcom/psdemo/outdoorexplorer/data/Location;", "getLocationById", "locationId", "getLocationWithActivities", "Lcom/psdemo/outdoorexplorer/data/LocationWithActivities;", "toggleActivityGeofence", "Lcom/psdemo/outdoorexplorer/data/GeofencingChanges;", "id", "GetLocationAsyncTask", "ToggleAsyncTask", "app_debug"})
public final class OutdoorRoomRepository implements com.psdemo.outdoorexplorer.data.OutdoorRepository {
    private final com.psdemo.outdoorexplorer.data.OutdoorDao outdoorDao = null;
    
    public OutdoorRoomRepository(@org.jetbrains.annotations.NotNull()
    com.psdemo.outdoorexplorer.data.OutdoorDao outdoorDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.List<com.psdemo.outdoorexplorer.data.Activity>> getAllActivities() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.List<com.psdemo.outdoorexplorer.data.Location>> getAllLocations() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<com.psdemo.outdoorexplorer.data.ActivityWithLocations> getActivityWithLocations(int activityId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.psdemo.outdoorexplorer.data.Location getLocationById(int locationId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<com.psdemo.outdoorexplorer.data.LocationWithActivities> getLocationWithActivities(int locationId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.psdemo.outdoorexplorer.data.GeofencingChanges toggleActivityGeofence(int id) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J%\u0010\n\u001a\u00020\u00042\u0016\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\f\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u000e"}, d2 = {"Lcom/psdemo/outdoorexplorer/data/OutdoorRoomRepository$GetLocationAsyncTask;", "Landroid/os/AsyncTask;", "", "", "Lcom/psdemo/outdoorexplorer/data/Location;", "outdoorDao", "Lcom/psdemo/outdoorexplorer/data/OutdoorDao;", "(Lcom/psdemo/outdoorexplorer/data/OutdoorDao;)V", "getOutdoorDao", "()Lcom/psdemo/outdoorexplorer/data/OutdoorDao;", "doInBackground", "ids", "", "([Ljava/lang/Integer;)Lcom/psdemo/outdoorexplorer/data/Location;", "app_debug"})
    static final class GetLocationAsyncTask extends android.os.AsyncTask<java.lang.Integer, kotlin.Unit, com.psdemo.outdoorexplorer.data.Location> {
        @org.jetbrains.annotations.NotNull()
        private final com.psdemo.outdoorexplorer.data.OutdoorDao outdoorDao = null;
        
        public GetLocationAsyncTask(@org.jetbrains.annotations.NotNull()
        com.psdemo.outdoorexplorer.data.OutdoorDao outdoorDao) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.psdemo.outdoorexplorer.data.OutdoorDao getOutdoorDao() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        protected com.psdemo.outdoorexplorer.data.Location doInBackground(@org.jetbrains.annotations.NotNull()
        java.lang.Integer... ids) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J%\u0010\u000e\u001a\u00020\u00042\u0016\u0010\u000f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0010\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0012"}, d2 = {"Lcom/psdemo/outdoorexplorer/data/OutdoorRoomRepository$ToggleAsyncTask;", "Landroid/os/AsyncTask;", "", "", "Lcom/psdemo/outdoorexplorer/data/GeofencingChanges;", "outdoorDao", "Lcom/psdemo/outdoorexplorer/data/OutdoorDao;", "(Lcom/psdemo/outdoorexplorer/data/OutdoorDao;)V", "getOutdoorDao", "()Lcom/psdemo/outdoorexplorer/data/OutdoorDao;", "createGeofence", "Lcom/google/android/gms/location/Geofence;", "location", "Lcom/psdemo/outdoorexplorer/data/Location;", "doInBackground", "ids", "", "([Ljava/lang/Integer;)Lcom/psdemo/outdoorexplorer/data/GeofencingChanges;", "app_debug"})
    static final class ToggleAsyncTask extends android.os.AsyncTask<java.lang.Integer, kotlin.Unit, com.psdemo.outdoorexplorer.data.GeofencingChanges> {
        @org.jetbrains.annotations.NotNull()
        private final com.psdemo.outdoorexplorer.data.OutdoorDao outdoorDao = null;
        
        public ToggleAsyncTask(@org.jetbrains.annotations.NotNull()
        com.psdemo.outdoorexplorer.data.OutdoorDao outdoorDao) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.psdemo.outdoorexplorer.data.OutdoorDao getOutdoorDao() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        protected com.psdemo.outdoorexplorer.data.GeofencingChanges doInBackground(@org.jetbrains.annotations.NotNull()
        java.lang.Integer... ids) {
            return null;
        }
        
        private final com.google.android.gms.location.Geofence createGeofence(com.psdemo.outdoorexplorer.data.Location location) {
            return null;
        }
    }
}