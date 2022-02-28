package com.psdemo.outdoorexplorer.ui.locations;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class LocationsFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private LocationsFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private LocationsFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static LocationsFragmentArgs fromBundle(@NonNull Bundle bundle) {
    LocationsFragmentArgs __result = new LocationsFragmentArgs();
    bundle.setClassLoader(LocationsFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("activityId")) {
      int activityId;
      activityId = bundle.getInt("activityId");
      __result.arguments.put("activityId", activityId);
    } else {
      __result.arguments.put("activityId", 0);
    }
    if (bundle.containsKey("title")) {
      String title;
      title = bundle.getString("title");
      if (title == null) {
        throw new IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("title", title);
    } else {
      __result.arguments.put("title", "Locations");
    }
    return __result;
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static LocationsFragmentArgs fromSavedStateHandle(
      @NonNull SavedStateHandle savedStateHandle) {
    LocationsFragmentArgs __result = new LocationsFragmentArgs();
    if (savedStateHandle.contains("activityId")) {
      int activityId;
      activityId = savedStateHandle.get("activityId");
      __result.arguments.put("activityId", activityId);
    } else {
      __result.arguments.put("activityId", 0);
    }
    if (savedStateHandle.contains("title")) {
      String title;
      title = savedStateHandle.get("title");
      if (title == null) {
        throw new IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("title", title);
    } else {
      __result.arguments.put("title", "Locations");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  public int getActivityId() {
    return (int) arguments.get("activityId");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getTitle() {
    return (String) arguments.get("title");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("activityId")) {
      int activityId = (int) arguments.get("activityId");
      __result.putInt("activityId", activityId);
    } else {
      __result.putInt("activityId", 0);
    }
    if (arguments.containsKey("title")) {
      String title = (String) arguments.get("title");
      __result.putString("title", title);
    } else {
      __result.putString("title", "Locations");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public SavedStateHandle toSavedStateHandle() {
    SavedStateHandle __result = new SavedStateHandle();
    if (arguments.containsKey("activityId")) {
      int activityId = (int) arguments.get("activityId");
      __result.set("activityId", activityId);
    } else {
      __result.set("activityId", 0);
    }
    if (arguments.containsKey("title")) {
      String title = (String) arguments.get("title");
      __result.set("title", title);
    } else {
      __result.set("title", "Locations");
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    LocationsFragmentArgs that = (LocationsFragmentArgs) object;
    if (arguments.containsKey("activityId") != that.arguments.containsKey("activityId")) {
      return false;
    }
    if (getActivityId() != that.getActivityId()) {
      return false;
    }
    if (arguments.containsKey("title") != that.arguments.containsKey("title")) {
      return false;
    }
    if (getTitle() != null ? !getTitle().equals(that.getTitle()) : that.getTitle() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + getActivityId();
    result = 31 * result + (getTitle() != null ? getTitle().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "LocationsFragmentArgs{"
        + "activityId=" + getActivityId()
        + ", title=" + getTitle()
        + "}";
  }

  public static final class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(@NonNull LocationsFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder() {
    }

    @NonNull
    public LocationsFragmentArgs build() {
      LocationsFragmentArgs result = new LocationsFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setActivityId(int activityId) {
      this.arguments.put("activityId", activityId);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setTitle(@NonNull String title) {
      if (title == null) {
        throw new IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("title", title);
      return this;
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    public int getActivityId() {
      return (int) arguments.get("activityId");
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public String getTitle() {
      return (String) arguments.get("title");
    }
  }
}
