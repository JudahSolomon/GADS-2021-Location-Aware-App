package com.psdemo.outdoorexplorer.ui.map;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.psdemo.outdoorexplorer.R;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class MapFragmentDirections {
  private MapFragmentDirections() {
  }

  @NonNull
  public static ActionNavigationMapToNavigationLocation actionNavigationMapToNavigationLocation() {
    return new ActionNavigationMapToNavigationLocation();
  }

  public static class ActionNavigationMapToNavigationLocation implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionNavigationMapToNavigationLocation() {
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionNavigationMapToNavigationLocation setLocationId(int locationId) {
      this.arguments.put("locationId", locationId);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("locationId")) {
        int locationId = (int) arguments.get("locationId");
        __result.putInt("locationId", locationId);
      } else {
        __result.putInt("locationId", 0);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_navigation_map_to_navigation_location;
    }

    @SuppressWarnings("unchecked")
    public int getLocationId() {
      return (int) arguments.get("locationId");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionNavigationMapToNavigationLocation that = (ActionNavigationMapToNavigationLocation) object;
      if (arguments.containsKey("locationId") != that.arguments.containsKey("locationId")) {
        return false;
      }
      if (getLocationId() != that.getLocationId()) {
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
      result = 31 * result + getLocationId();
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionNavigationMapToNavigationLocation(actionId=" + getActionId() + "){"
          + "locationId=" + getLocationId()
          + "}";
    }
  }
}
