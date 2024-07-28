package HomeWork4;

import java.util.Random;

public class Television {
    private Channel[] channels;
    Random random = new Random();
    int rndOn = random.nextInt(2);
    int historyRandom = random.nextInt(5);


    public Television(Channel... channels) {
        setChannels(channels);
    }

    public void getTurnOn() {
        System.out.println("Телевизор включен!");
        int check = historyRandom;
        System.out.println("Включен канал: " + channels[check].getChannelName()
                + ", сейчас транслируется: " + channels[check].getPrograms()[rndOn].getProgramName());
        historyRandom = check;
    }

    public Channel[] getChannels() {
        return channels;
    }

    public void setChannels(Channel... channels) {
        this.channels = channels;
    }

    public int getHistoryRandom() {
        return historyRandom;
    }

    public void setHistoryRandom(int historyRandom) {
        this.historyRandom = historyRandom;
    }
}
