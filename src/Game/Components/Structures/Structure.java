package Game.Components.Structures;

import Game.Components.Component;

import java.util.ArrayList;

public abstract class Structure extends Component {
    public static ArrayList<Structure> structuresAList = new ArrayList<>();

    public abstract boolean clickedIn();
    public abstract boolean passable();
}
