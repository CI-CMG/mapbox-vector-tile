package edu.colorado.cires.cmg.mvt.adapt.jts;

import edu.colorado.cires.cmg.mvt.VectorTile;
import edu.colorado.cires.cmg.mvt.build.MvtLayerProps;

/**
 * Ignores user data, does not take any action.
 *
 * @see IUserDataConverter
 */
public final class UserDataIgnoreConverter implements IUserDataConverter {
    @Override
    public void addTags(Object userData, MvtLayerProps layerProps,
                        VectorTile.Tile.Feature.Builder featureBuilder) {
    }
}
