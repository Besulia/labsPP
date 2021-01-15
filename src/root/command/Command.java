package root.command;

import root.Knight;

public abstract class Command {
    public Knight knight;
    private Knight backup;

    Command(Knight knight) {
        this.knight = knight;
    }

    void backup() {
        backup = knight;
    }

    public void undo() {
        knight = backup;
    }

    public abstract boolean execute();
}
