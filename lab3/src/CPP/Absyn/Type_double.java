package CPP.Absyn; // Java Package generated by the BNF Converter.

public class Type_double extends Type {
  public Type_double() { }

  public <R,A> R accept(CPP.Absyn.Type.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof CPP.Absyn.Type_double) {
      return true;
    }
    return false;
  }

  public int hashCode() {
    return 37;
  }


}
