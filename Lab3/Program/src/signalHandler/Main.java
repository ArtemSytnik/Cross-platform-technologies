package signalHandler;

import handlerLibrary.FileReader;
import handlerLibrary.SignalCalculations;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        List<Integer> numbers = null;

        //Считываем сигнал из файла
        if (args.length == 0)
        {
            System.out.println("Путь к файлу не указан.");
            return;
        }
        try
        {
            numbers = FileReader.readFile(args[0]);
        }
        catch (FileNotFoundException ex)
        {
            System.out.println("Файл не найден");
            return;
        }
        catch (IOException ex)
        {
            System.out.println("Ошибка файла");
            return;
        }


        SignalCalculations calculator = new SignalCalculations();

        //Выполнение функций вычисления пересчитанных физических характеристик
        int dynamicRange = calculator.calculateDynamicRange(numbers);
        System.out.println("Динамический диапазон сигнала: " + dynamicRange);

        int signalEnergy = calculator.calculateSignalEnergy(numbers);
        System.out.println("Энергия сигнала: " + signalEnergy);

        float avgSignalStrength = calculator.calculateAverageSignalStrength(numbers);
        System.out.println("Средняя мощность сигнала: " + avgSignalStrength);

        float avgSignalSamplesValue = calculator.calculateAverageSignalSamplesValue(numbers);
        System.out.println("Среднее значение отсчетов сигнала: " + avgSignalSamplesValue);

        float signalSampleValuesVariance = calculator.calculateSignalSampleValuesVariance(numbers);
        System.out.println("Дисперсия значений отсчетов сигнала: " + signalSampleValuesVariance);

        float correlationInterval = calculator.calculateCorrelationInterval(numbers);
        System.out.println("Интервал корреляции: " + correlationInterval);


        for(int tau = -20; tau <= 20; tau++)
        {
            float autocorrelationResult = calculator.calculateAutocorrelation(numbers,tau);
            System.out.println("Автокорреляция(" + tau + "): " + autocorrelationResult);
        }
    }
}
