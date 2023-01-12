package ru.netology;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    private int minRadioStation = 0;
    private int maxRadioStation;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int radioStationsQuantity;

    public Radio() {
        this.radioStationsQuantity = 10;
        this.maxRadioStation = this.radioStationsQuantity - 1;

        /*Тут появился вопрос: является ли код в этом конструкторе избыточным? Логичнее будет просто написать:
        this.maxRadioStation = 9; ? */
    }

    public Radio(int radioStationsQuantity) {
        this.maxRadioStation = radioStationsQuantity - 1;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < minRadioStation) {
            return;
        }
        if (newCurrentRadioStation > maxRadioStation) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
        //System.out.println("К сожалению, Вы ввели несуществующий номер станции. Пожалуйста, выберите номер от 0 до 9.");
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if ((newCurrentVolume > maxVolume) && (newCurrentVolume < minVolume)) {
            return;
        } else {
            currentVolume = newCurrentVolume;
        }
    }


    public int nextRadioStation() {
        if (currentRadioStation == maxRadioStation) {
            currentRadioStation = minRadioStation;
        } else {
            currentRadioStation++;
        }
        return currentRadioStation;
    }

    public int prevRadioStation() {
        if (currentRadioStation == minRadioStation) {
            currentRadioStation = maxRadioStation;
        } else {
            currentRadioStation--;
        }
        return currentRadioStation;
    }


    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }


}
