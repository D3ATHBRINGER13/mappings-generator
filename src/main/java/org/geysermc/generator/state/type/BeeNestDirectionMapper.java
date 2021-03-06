package org.geysermc.generator.state.type;

import org.geysermc.generator.Pair;
import org.geysermc.generator.state.StateMapper;
import org.geysermc.generator.state.StateRemapper;

@StateRemapper(value = "facing", blockRegex = "^minecraft:bee_nest|^minecraft:beehive")
public class BeeNestDirectionMapper extends StateMapper<Integer> {

    @Override
    public Pair<String, Integer> translateState(String fullIdentifier, String value) {
        int direction = 0;
        switch (value) {
            case "south":
                direction = 0;
                break;
            case "west":
                direction = 1;
                break;
            case "north":
                direction = 2;
                break;
            case "east":
                direction = 3;
                break;
        }
        return new Pair<>("direction", direction);
    }
}
