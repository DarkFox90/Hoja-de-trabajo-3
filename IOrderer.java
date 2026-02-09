public interface IOrderer <T extends Comparable<T>> {
    void sort(T[] arr);
}