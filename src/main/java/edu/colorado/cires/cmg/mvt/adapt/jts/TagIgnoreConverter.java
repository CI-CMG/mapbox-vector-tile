package edu.colorado.cires.cmg.mvt.adapt.jts;

import edu.colorado.cires.cmg.mvt.VectorTile;

import java.util.List;

/**
 * Ignores tags, always returns null.
 *
 * @see ITagConverter
 */
public final class TagIgnoreConverter implements ITagConverter {
    @Override
    public Object toUserData(Long id, List<Integer> tags, List<String> keysList,
                             List<VectorTile.Tile.Value> valuesList) {
        return null;
    }
}
