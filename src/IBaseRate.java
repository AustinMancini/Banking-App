public interface IBaseRate {
    // ******API******* //

    // A method that returns the base rate
    @SuppressWarnings("SameReturnValue")
    default double getBaseRate() {
        return 2.5;
    }

}
