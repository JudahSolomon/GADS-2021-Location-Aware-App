package com.psdemo.outdoorexplorer.ui.locations;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00062\u0006\u0010\u000f\u001a\u00020\u0010R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/psdemo/outdoorexplorer/ui/locations/LocationsViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "allLocations", "Landroidx/lifecycle/LiveData;", "", "Lcom/psdemo/outdoorexplorer/data/Location;", "getAllLocations", "()Landroidx/lifecycle/LiveData;", "outdoorRepository", "Lcom/psdemo/outdoorexplorer/data/OutdoorRepository;", "locationsWithActivity", "Lcom/psdemo/outdoorexplorer/data/ActivityWithLocations;", "activityId", "", "app_debug"})
public final class LocationsViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.psdemo.outdoorexplorer.data.OutdoorRepository outdoorRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.psdemo.outdoorexplorer.data.Location>> allLocations = null;
    
    public LocationsViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.psdemo.outdoorexplorer.data.Location>> getAllLocations() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.psdemo.outdoorexplorer.data.ActivityWithLocations> locationsWithActivity(int activityId) {
        return null;
    }
}