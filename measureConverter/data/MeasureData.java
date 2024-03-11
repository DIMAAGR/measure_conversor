package measureConverter.data;

import measureConverter.enums.MeasureType;

public class MeasureData {

    public static class MeasureDataBuilder {
        private MeasureType from;
        private MeasureType to;
        private double value;

        public MeasureDataBuilder from(MeasureType from) {
            this.from = from;
            return this;
        }

        public MeasureDataBuilder to(MeasureType to) {
            this.to = to;
            return this;
        }

        public MeasureDataBuilder value(double value) {
            this.value = value;
            return this;
        }

        public MeasureData build(MeasureDataBuilder builder) {
            return new MeasureData(this);
        }
    }

    public MeasureData(MeasureDataBuilder builder) {
        this.from = builder.from;
        this.to = builder.to;
        this.value = builder.value;
    }

    private MeasureType from;
    private MeasureType to;
    private Double value;

    public MeasureType getFrom() {
        return from;
    }

    public MeasureType getTo() {
        return to;
    }

    public double getValue() {
        return value;
    }

    public boolean isEmpty() {
        return (from == null) && (to == null) && (value == 0);
    }
}
