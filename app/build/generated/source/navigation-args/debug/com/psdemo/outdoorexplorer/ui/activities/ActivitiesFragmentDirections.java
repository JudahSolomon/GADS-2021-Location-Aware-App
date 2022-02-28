package com.psdemo.outdoorexplorer.ui.activities;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.psdemo.outdoorexplorer.R;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class ActivitiesFragmentDirections {
  private ActivitiesFragmentDirections() {
  }

  @NonNull
  public static ActionNavigationActivitiesToNavigationLocations actionNavigationActivitiesToNavigationLocations(
      ) {
    return new ActionNavigationActivitiesToNavigationLocations();
  }

  public static class ActionNavigationActivitiesToNavigationLocations implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionNavigationActivitiesToNavigationLocations() {
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionNavigationActivitiesToNavigationLocations setActivityId(int activityId) {
      this.arguments.put("activityId", activityId);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionNavigationActivitiesToNavigationLocations setTitle(@NonNull String title) {
      if (title == null) {
        throw new IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("title", title);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
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

    @Override
    public int getActionId() {
      return R.id.action_navigation_activities_to_navigation_locations;
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

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionNavigationActivitiesToNavigationLocations that = (ActionNavigationActivitiesToNavigationLocations) object;
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
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + getActivityId();
      result = 31 * result + (getTitle() != null ? getTitle().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionNavigationActivitiesToNavigationLocations(actionId=" + getActionId() + "){"
          + "activityId=" + getActivityId()
          + ", title=" + getTitle()
          + "}";
    }
  }
}
