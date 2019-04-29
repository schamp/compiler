package decaf;
import java.util.Stack;
import java.util.Map;
import java.util.HashMap;

import decaf.generated.*;

class Scopes {
  private Stack<SymbolTable> scopes;

  public Scopes() {
    this.scopes = new Stack<SymbolTable>();
  }

  void enterScope() {
    SymbolTable st = new SymbolTable();
    scopes.push(st);
  }

  void leaveScope() {
    scopes.pop();
  }

  void addVar(String id, DecafType t) {
    SymbolTable current = scopes.peek();
    current.Vars.put(id, t);
  }

  void addFunc(String id, DecafType t) {
    SymbolTable current = scopes.peek();
    current.Funcs.put(id, t);
  }

  DecafType lookupVar (String id) throws Exception {
    for (int i = scopes.size(); i >= 0; i--) {
      SymbolTable st = scopes.get(i);
      if (st.Vars.containsKey(id)) {
        return st.Vars.get(id);
      }
    }
    throw new Exception(id + " not found");
  }

  DecafType lookupFunc (String id) throws Exception {
    for (int i = scopes.size(); i >= 0; i--) {
      SymbolTable st = scopes.get(i);
      if (st.Funcs.containsKey(id)) {
        return st.Funcs.get(id);
      }
    }
    throw new Exception(id + " not found");
  }

  private class SymbolTable {
    public Map<String, DecafType> Vars; 
    public Map<String, DecafType> Funcs;

    SymbolTable() {
      Vars = new HashMap<>();
      Funcs = new HashMap<>();
    }
  }
}
