package ru.kav.systemprogramming.calculatorwithfile;

import ru.kav.systemprogramming.calculatorwithconsel.ChooseOperation;
import ru.kav.systemprogramming.calculatorwithconsel.DataCheck;
import ru.kav.systemprogramming.calculatorwithconsel.IntegerInNumbers;
import ru.kav.systemprogramming.calculatorwithconsel.Split;

import java.util.ArrayList;

public class Launch {

    /**
     * выполняет ???
     * @param listOfExpressions - спсиок выражений
     * @return реззультаты выражений (или " Неверный ввод ", если данные выражение не верны)
     */

    public static ArrayList сalculations(ArrayList listOfExpressions) {

        ArrayList listOfResults = new ArrayList();

        for (int i = 0; i < listOfExpressions.size(); i++) {

            String expression = Split.splitListOfExpression(listOfExpressions, i);

            if (DataCheck.dataFileCheck(expression)) {
                String[] abc = Split.splitListOfExpression(expression);
                listOfResults.add(ChooseOperation.calculations(IntegerInNumbers.integerStringMassive(abc,0), IntegerInNumbers.integerStringMassive(abc,2), abc[1]));
            } else {
                listOfResults.add("Неверный ввод");
            }

        }
        return listOfResults;
    }
}
