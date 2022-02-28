package com.psdemo.outdoorexplorer.ui.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0015\u0016B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u001c\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u0014\u0010\u0013\u001a\u00020\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/psdemo/outdoorexplorer/ui/activities/ActivitiesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/psdemo/outdoorexplorer/ui/activities/ActivitiesAdapter$ActivityHolder;", "onClickListener", "Lcom/psdemo/outdoorexplorer/ui/activities/ActivitiesAdapter$OnClickListener;", "(Lcom/psdemo/outdoorexplorer/ui/activities/ActivitiesAdapter$OnClickListener;)V", "allActivities", "", "Lcom/psdemo/outdoorexplorer/data/Activity;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setActivities", "activities", "ActivityHolder", "OnClickListener", "app_debug"})
public final class ActivitiesAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.psdemo.outdoorexplorer.ui.activities.ActivitiesAdapter.ActivityHolder> {
    private final com.psdemo.outdoorexplorer.ui.activities.ActivitiesAdapter.OnClickListener onClickListener = null;
    private java.util.List<com.psdemo.outdoorexplorer.data.Activity> allActivities;
    
    public ActivitiesAdapter(@org.jetbrains.annotations.NotNull()
    com.psdemo.outdoorexplorer.ui.activities.ActivitiesAdapter.OnClickListener onClickListener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.psdemo.outdoorexplorer.ui.activities.ActivitiesAdapter.ActivityHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setActivities(@org.jetbrains.annotations.NotNull()
    java.util.List<com.psdemo.outdoorexplorer.data.Activity> activities) {
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.psdemo.outdoorexplorer.ui.activities.ActivitiesAdapter.ActivityHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n\u00a8\u0006\u000b"}, d2 = {"Lcom/psdemo/outdoorexplorer/ui/activities/ActivitiesAdapter$ActivityHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/psdemo/outdoorexplorer/ui/activities/ActivitiesAdapter;Landroid/view/View;)V", "bind", "", "activity", "Lcom/psdemo/outdoorexplorer/data/Activity;", "clickListener", "Lcom/psdemo/outdoorexplorer/ui/activities/ActivitiesAdapter$OnClickListener;", "app_debug"})
    public final class ActivityHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public ActivityHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.psdemo.outdoorexplorer.data.Activity activity, @org.jetbrains.annotations.NotNull()
        com.psdemo.outdoorexplorer.ui.activities.ActivitiesAdapter.OnClickListener clickListener) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\t"}, d2 = {"Lcom/psdemo/outdoorexplorer/ui/activities/ActivitiesAdapter$OnClickListener;", "", "onClick", "", "id", "", "title", "", "onGeofenceClick", "app_debug"})
    public static abstract interface OnClickListener {
        
        public abstract void onClick(int id, @org.jetbrains.annotations.NotNull()
        java.lang.String title);
        
        public abstract void onGeofenceClick(int id);
    }
}