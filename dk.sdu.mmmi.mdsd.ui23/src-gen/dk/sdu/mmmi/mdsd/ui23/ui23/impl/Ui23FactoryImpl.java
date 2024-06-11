/**
 * generated by Xtext 2.34.0
 */
package dk.sdu.mmmi.mdsd.ui23.ui23.impl;

import dk.sdu.mmmi.mdsd.ui23.ui23.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Ui23FactoryImpl extends EFactoryImpl implements Ui23Factory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Ui23Factory init()
  {
    try
    {
      Ui23Factory theUi23Factory = (Ui23Factory)EPackage.Registry.INSTANCE.getEFactory(Ui23Package.eNS_URI);
      if (theUi23Factory != null)
      {
        return theUi23Factory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new Ui23FactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ui23FactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case Ui23Package.UI: return createUI();
      case Ui23Package.FUNCTION: return createFunction();
      case Ui23Package.FORM: return createForm();
      case Ui23Package.LAYOUT: return createLayout();
      case Ui23Package.COMPONENT: return createComponent();
      case Ui23Package.ELEMENT: return createElement();
      case Ui23Package.LABEL: return createLabel();
      case Ui23Package.INPUT_TEXT: return createInputText();
      case Ui23Package.BUTTON: return createButton();
      case Ui23Package.FORM_USE: return createFormUse();
      case Ui23Package.PARAMETER: return createParameter();
      case Ui23Package.TYPE: return createType();
      case Ui23Package.EXPRESSION: return createExpression();
      case Ui23Package.BOOL_TYPE: return createBoolType();
      case Ui23Package.STRING_TYPE: return createStringType();
      case Ui23Package.NUMBER_TYPE: return createNumberType();
      case Ui23Package.AND: return createAnd();
      case Ui23Package.OR: return createOr();
      case Ui23Package.EQ: return createEQ();
      case Ui23Package.NEQ: return createNEQ();
      case Ui23Package.LT: return createLT();
      case Ui23Package.LTE: return createLTE();
      case Ui23Package.GT: return createGT();
      case Ui23Package.GTE: return createGTE();
      case Ui23Package.CONC: return createConc();
      case Ui23Package.PLUS: return createPlus();
      case Ui23Package.MINUS: return createMinus();
      case Ui23Package.MULT: return createMult();
      case Ui23Package.DIV: return createDiv();
      case Ui23Package.VALUE_INT: return createValueInt();
      case Ui23Package.VALUE_STRING: return createValueString();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UI createUI()
  {
    UIImpl ui = new UIImpl();
    return ui;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Function createFunction()
  {
    FunctionImpl function = new FunctionImpl();
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Form createForm()
  {
    FormImpl form = new FormImpl();
    return form;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Layout createLayout()
  {
    LayoutImpl layout = new LayoutImpl();
    return layout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Component createComponent()
  {
    ComponentImpl component = new ComponentImpl();
    return component;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Element createElement()
  {
    ElementImpl element = new ElementImpl();
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Label createLabel()
  {
    LabelImpl label = new LabelImpl();
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InputText createInputText()
  {
    InputTextImpl inputText = new InputTextImpl();
    return inputText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Button createButton()
  {
    ButtonImpl button = new ButtonImpl();
    return button;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FormUse createFormUse()
  {
    FormUseImpl formUse = new FormUseImpl();
    return formUse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BoolType createBoolType()
  {
    BoolTypeImpl boolType = new BoolTypeImpl();
    return boolType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StringType createStringType()
  {
    StringTypeImpl stringType = new StringTypeImpl();
    return stringType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NumberType createNumberType()
  {
    NumberTypeImpl numberType = new NumberTypeImpl();
    return numberType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public And createAnd()
  {
    AndImpl and = new AndImpl();
    return and;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Or createOr()
  {
    OrImpl or = new OrImpl();
    return or;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EQ createEQ()
  {
    EQImpl eq = new EQImpl();
    return eq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NEQ createNEQ()
  {
    NEQImpl neq = new NEQImpl();
    return neq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LT createLT()
  {
    LTImpl lt = new LTImpl();
    return lt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LTE createLTE()
  {
    LTEImpl lte = new LTEImpl();
    return lte;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GT createGT()
  {
    GTImpl gt = new GTImpl();
    return gt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GTE createGTE()
  {
    GTEImpl gte = new GTEImpl();
    return gte;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Conc createConc()
  {
    ConcImpl conc = new ConcImpl();
    return conc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Plus createPlus()
  {
    PlusImpl plus = new PlusImpl();
    return plus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Minus createMinus()
  {
    MinusImpl minus = new MinusImpl();
    return minus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Mult createMult()
  {
    MultImpl mult = new MultImpl();
    return mult;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Div createDiv()
  {
    DivImpl div = new DivImpl();
    return div;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ValueInt createValueInt()
  {
    ValueIntImpl valueInt = new ValueIntImpl();
    return valueInt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ValueString createValueString()
  {
    ValueStringImpl valueString = new ValueStringImpl();
    return valueString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Ui23Package getUi23Package()
  {
    return (Ui23Package)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static Ui23Package getPackage()
  {
    return Ui23Package.eINSTANCE;
  }

} //Ui23FactoryImpl