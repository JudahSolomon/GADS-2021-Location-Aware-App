package com.psdemo.outdoorexplorer.ui.locations;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.psdemo.outdoorexplorer.R;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class LocationsFragmentDirections {
  private LocationsFragmentDirections() {
  }

  @NonNull
  public static ActionNavigationLocationsToNavigationLocation actionNavigationLocationsToNavigationLocation(
      ) {
    return new ActionNavigationLocationsToNavigationLocation();
  }

  public static class ActionNavigationLocationsToNavigationLocation implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionNavigationLocationsToNavigationLocation() {
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionNavigationLocationsToNavigationLocation setLocationId(int locationId) {
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
      return R.id.action_navigation_locations_to_navigation_location;
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
      ActionNavigationLocationsToNavigationLocation that = (ActionNavigationLocationsToNavigationLocation) object;
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
      return "ActionNavigationLocationsToNavigationLocation(actionId=" + getActionId() + "){"
          + "locationId=" + getLocationId()
          + "}";
    }
  }
}
