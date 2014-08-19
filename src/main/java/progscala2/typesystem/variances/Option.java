// src/main/java/progscala2/typesystem/variances/Option.java
package progscala2.typesystem.variances;

abstract public class Option<T> {
  abstract public boolean isEmpty();

  abstract public T get();

  public T getOrElse(T t) {
    return isEmpty() ? t : get();
  }
}
