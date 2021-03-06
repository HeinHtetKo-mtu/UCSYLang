/* Generated By:JJTree: Do not edit this line. ASTClassHeader.java */
import java.util.*;


public class ASTClassHeader extends SimpleNode {
	Token t;
	
	ASTClassModifier classModifier;
	ASTInheritsClause inheritsClause;
	ASTAdaptsClause   adaptsClause;
	ASTImplementsClause implementsClause;
	ASTConformsClause  conformsClause;
	//============================
	String className;
	String parentClassName;
	
	ArrayList<String> interfaceList = new ArrayList<String>();
	ArrayList<String> conformList = new ArrayList<String>();	
	
	/*ASTInheritsClause inheritNode;
	ASTImplementsClause implementNode;
	ASTConformsClause confomNode;
	*/
  public ASTClassHeader(int id) {
    super(id);
    
  }

  public ASTClassHeader(UCSY p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(UCSYVisitor visitor, UCSYClass theClass) {
    return visitor.visit(this, theClass);
  }
}
