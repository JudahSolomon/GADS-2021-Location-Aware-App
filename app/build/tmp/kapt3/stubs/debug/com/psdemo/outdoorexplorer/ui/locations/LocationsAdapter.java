package com.psdemo.outdoorexplorer.ui.locations;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0019\u001aB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u001c\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016J\u000e\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\nJ\u0014\u0010\u0017\u001a\u00020\u000e2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0007R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/psdemo/outdoorexplorer/ui/locations/LocationsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/psdemo/outdoorexplorer/ui/locations/LocationsAdapter$LocationHolder;", "onClickListener", "Lcom/psdemo/outdoorexplorer/ui/locations/LocationsAdapter$OnClickListener;", "(Lcom/psdemo/outdoorexplorer/ui/locations/LocationsAdapter$OnClickListener;)V", "allLocations", "", "Lcom/psdemo/outdoorexplorer/data/Location;", "currentLocation", "Landroid/location/Location;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setCurrentLocation", "location", "setLocations", "locations", "LocationHolder", "OnClickListener", "app_debug"})
public final class LocationsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.psdemo.outdoorexplorer.ui.locations.LocationsAdapter.LocationHolder> {
    private final com.psdemo.outdoorexplorer.ui.locations.LocationsAdapter.OnClickListener onClickListener = null;
    private java.util.List<com.psdemo.outdoorexplorer.data.Location> allLocations;
    private android.location.Location currentLocation;
    
    public LocationsAdapter(@org.jetbrains.annotations.NotNull()
    com.psdemo.outdoorexplorer.ui.locations.LocationsAdapter.OnClickListener onClickListener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.psdemo.outdoorexplorer.ui.locations.LocationsAdapter.LocationHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setLocations(@org.jetbrains.annotations.NotNull()
    java.util.List<com.psdemo.outdoorexplorer.data.Location> locations) {
    }
    
    public final void setCurrentLocation(@org.jetbrains.annotations.NotNull()
    android.location.Location location) {
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.psdemo.outdoorexplorer.ui.locations.LocationsAdapter.LocationHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n\u00a8\u0006\u000b"}, d2 = {"Lcom/psdemo/outdoorexplorer/ui/locations/LocationsAdapter$LocationHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/psdemo/outdoorexplorer/ui/locations/LocationsAdapter;Landroid/view/View;)V", "bind", "", "location", "Lcom/psdemo/outdoorexplorer/data/Location;", "clickListener", "Lcom/psdemo/outdoorexplorer/ui/locations/LocationsAdapter$OnClickListener;", "app_debug"})
    public final class LocationHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public LocationHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.psdemo.outdoorexplorer.data.Location location, @org.jetbrains.annotations.NotNull()
        com.psdemo.outdoorexplorer.ui.locations.LocationsAdapter.OnClickListener clickListener) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/psdemo/outdoorexplorer/ui/locations/LocationsAdapter$OnClickListener;", "", "onClick", "", "id", "", "app_debug"})
    public static abstract interface OnClickListener {
        
        public abstract void onClick(int id);
    }
}