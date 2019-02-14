package com.mcfarevee.groceries;

public class BulkFood {
        private String name;
        private Unit unit;
        private int pricePerUnit;
        public int supply;

        public BulkFood(String name, Unit unit, int pricePerUnit, int supply) {
                this.name = name;
                this.unit = unit;
                this.pricePerUnit = pricePerUnit;
                this.supply = supply;
        }

        public boolean equals(BulkFood other) {
                return this.name.equals(other.name) && this.unit.equals(other.unit) && 
                        this.pricePerUnit == other.pricePerUnit && this.supply == other.supply;
        }

        public String name() {
                return this.name;
        }

        public Unit unit() {
                return this.unit;
        }

        public int pricePerUnit() {
                return this.pricePerUnit;
        }
}

        
