# CalculatorAndroidApp

The MainActivity class is the main activity of the calculator application. It extends the AppCompatActivity class, which is a base class for activities that use the support library action bar features. The class contains various instance variables for UI elements such as buttons, text fields, and a text view.

In the onCreate method, the layout for the main activity is set using setContentView with the layout file activity_main.xml. The UI elements are initialized by finding their respective views using findViewById and assigning them to the corresponding variables.

Listeners are set for each button using anonymous inner classes implementing the View.OnClickListener interface. Each button has its own click listener that performs a specific operation when clicked, such as addition, subtraction, division, multiplication, exponentiation, remainder, and multiplication with constants like Euler's number (e) and pi. The operations retrieve the values from the num1EditText and num2EditText fields, perform the calculation, and display the result in the resultTextView text view.

There is also a performDelete method that clears the input fields and result text view.

The infoButton method is called when the corresponding button is clicked and it starts a new activity (Info) using an intent.

The Info class represents a simple information screen that extends AppCompatActivity. It also sets its layout in the onCreate method using setContentView. It contains a single method returnHome that is called when a button is clicked, and it starts the MainActivity activity using an intent.

Overall, this code implements a basic calculator application with various mathematical operations and a separate information screen.
