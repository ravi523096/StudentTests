// Evaluate an expression based on the data passed to it
/**
 * 
 * @author Ravi_Kalla
 *
 */
public class ExpressionEvaluation {
	public static void main(String[] args) {
		String[] arrData = {"1", "2", "3"};
		String strExpression = "{1}+{2}={3}";
		boolean blnExpressionResult = ExpressionEvaluation.evalueateExpression(arrData, strExpression);
		System.out.println("Result of evaluated expression is = " + blnExpressionResult);
	}

	public static boolean evalueateExpression(String[] arrData, String strExpression) {
		// TODO : Write logic to evaluate expression based on the data passed to it
		return false;
	}
}

/*
Eg1:
	I/P:
		arrData = {"10", "2", "12"};
		strExpression = "{1}+{2}={3}";

	O/P :
		Result of evaluated expression is = true

Eg2:
	I/P:
		arrData = {"10", "2", "11"};
		strExpression = "{1}+{2}={3}";

	O/P :
		Result of evaluated expression is = false

Eg3:
	I/P:
		arrData = {"10", "2", "11"};
		strExpression = "({1}+{2})/6=(({3}-1)/({1}/{2}))";

	O/P :
		Result of evaluated expression is = true
*/
