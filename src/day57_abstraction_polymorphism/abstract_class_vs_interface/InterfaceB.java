package day57_abstraction_polymorphism.abstract_class_vs_interface;

import java.io.Serializable;

  // interface can extend multiple of other interfaces -> Interfaces support multi-inheritance
  // when it extends another interface, child interface is not responsible to override any methods
  // concrete sub class will be responsible for overriding all abstract methods
public interface InterfaceB extends InterfaceA, Serializable, Cloneable {

}
