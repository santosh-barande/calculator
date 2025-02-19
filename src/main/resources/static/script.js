let display = document.getElementById("result");
		let currentInput = "";

		function Number(number) {
			if (currentInput === "0") {
				currentInput = number;
			} else {
				currentInput += number;
			}
			updateDisplay();
		}

		function appendOperator(operator) {
			if (currentInput !== "") {
				currentInput += " " + operator + " ";
				updateDisplay();
			}
		}

		function calculate() {
			try {
				currentInput = eval(currentInput).toString();
				updateDisplay();
			} catch (error) {
				currentInput = "Error";
				updateDisplay();
			}
		}

		function clearDisplay() {
			currentInput = "";
			updateDisplay();
		}

		function updateDisplay() {
			display.innerText = currentInput || "0";
		}