package constant;

public class Constant {
    public static final String LINE_SEPARATOR = "____________________________________________________________";

    public static final String INDENT = "%s";

    // Command keywords
    /**
     * Command keyword for listing tasks.
     */
    public static final String COMMAND_LIST = "list";

    /**
     * Command keyword for adding a new expense
     */
    public static final String COMMAND_ADD = "add";

    /**
     * Command keyword for searching transactions
     */
    public static final String COMMAND_SEARCH = "search";

    /**
     * Command keyword for setting a spending budget limit.
     */
    public static final String COMMAND_SET_BUDGET = "setbudget";

    /**
     * Command keyword for setting reminders for upcoming expenses.
     */
    public static final String COMMAND_NOTIFY = "notify";

    /**
     * Command keyword for unmarking a task (marking it as incomplete).
     */
    public static final String COMMAND_UNTICK = "untick";

    /**
     * Command keyword for unmarking a task (marking it as incomplete).
     */
    public static final String COMMAND_TICK = "tick";

    /**
     * Command keyword for deleting a task.
     */
    public static final String COMMAND_DELETE = "delete";

    /**
     * Command keyword for exiting the program
     */
    public static final String COMMAND_EXIT = "exit";

    /**
     * Command keyword for setting a period for a transaction to be recurring
     */
    public static final String COMMAND_RECUR = "recur";

    /**
     * Command keyword for modifying savings
     */
    public static final String COMMAND_SAVE = "save";

    /**
     * Command prefix for goal-related actions
     */
    public static final String COMMAND_GOAL = "goal";

    /**
     * Command tag for modifying the target amount
     */
    public static final String GOAL_TARGET = "target";

    /**
     * Command tag for modifying the goal description
     */
    public static final String GOAL_DESC = "desc";

    /**
     * Command tag for modifying the goal title
     */
    public static final String GOAL_TITLE = "title";

    /**
     * Command tag for checking whether the goal is met
     */
    public static final String GOAL_STATUS = "status";

    /**
     * Command tag for creating a new goal
     */
    public static final String GOAL_NEW = "new";
    /**
     * Command keyword for setting a period for a transaction to be recurring
     */
    public static final String COMMAND_CHANGECATE = "changecate";

    /**
     * Represents an invalid input exception.
     */
    public static final String INVALID_INPUT = "OOPS!!! I'm sorry, but I don't know what that means :-(";

    /**
     * Identifier for setting a budget amount in user input.
     */
    public static final String IDENTIFIER_AMOUNT = "a/";

    /**
     * Identifier for specifying a description in user input.
     */
    public static final String IDENTIFIER_DESCRIPTION = " d/";

    /**
     * Identifier for specifying a category type in user input.
     */
    public static final String IDENTIFIER_CATEGORY = " c/";

    /**
     * Identifier for specifying a category type in user input.
     */
    public static final String IDENTIFIER_DATE = " t/";
}
