package info.vladyslav.EPAM_HW_9_1223.behavioral.command;

public class DeleteCommand implements Command {
    Database database;

    public DeleteCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.delete();
    }
}
