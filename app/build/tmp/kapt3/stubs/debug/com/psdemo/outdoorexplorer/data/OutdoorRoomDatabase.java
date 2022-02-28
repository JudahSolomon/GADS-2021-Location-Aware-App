package com.psdemo.outdoorexplorer.data;

import java.lang.System;

@androidx.room.Database(entities = {com.psdemo.outdoorexplorer.data.Activity.class, com.psdemo.outdoorexplorer.data.Location.class, com.psdemo.outdoorexplorer.data.ActivityLocationCrossRef.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/psdemo/outdoorexplorer/data/OutdoorRoomDatabase;", "Landroidx/room/RoomDatabase;", "()V", "outdoorDao", "Lcom/psdemo/outdoorexplorer/data/OutdoorDao;", "Companion", "app_debug"})
public abstract class OutdoorRoomDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final com.psdemo.outdoorexplorer.data.OutdoorRoomDatabase.Companion Companion = null;
    @kotlin.jvm.Volatile()
    private static volatile com.psdemo.outdoorexplorer.data.OutdoorRoomDatabase INSTANCE;
    
    public OutdoorRoomDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.psdemo.outdoorexplorer.data.OutdoorDao outdoorDao();
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007J\u001a\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0004H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/psdemo/outdoorexplorer/data/OutdoorRoomDatabase$Companion;", "", "()V", "INSTANCE", "Lcom/psdemo/outdoorexplorer/data/OutdoorRoomDatabase;", "getInstance", "context", "Landroid/content/Context;", "getJsonDataFromAsset", "", "fileName", "prepopulateDb", "", "db", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.psdemo.outdoorexplorer.data.OutdoorRoomDatabase getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private final void prepopulateDb(android.content.Context context, com.psdemo.outdoorexplorer.data.OutdoorRoomDatabase db) {
        }
        
        private final java.lang.String getJsonDataFromAsset(android.content.Context context, java.lang.String fileName) {
            return null;
        }
    }
}