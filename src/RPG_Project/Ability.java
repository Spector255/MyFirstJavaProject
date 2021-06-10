package RPG_Project;

public class Ability {
        public int BaseAttack = 5;
        public int StrongAttack = 20;
        public int Heal = 10;
        public int BaseAbility = 5;
        public int SpecialAbility = 20;

        public void MakeAbility(int BaseAttack, int StrongAttack, int Heal, int BaseAbility, int SpecialAbility) {
            this.BaseAttack = BaseAttack;
            this.StrongAttack = StrongAttack;
            this.Heal = Heal;
            this.BaseAbility = BaseAbility;
            this.SpecialAbility = SpecialAbility;
        }

        public int getBaseAttack() {
            return BaseAttack;
        }

        public int getStrongAttack() {
            return StrongAttack;
        }

        public int getHeal() {
            return Heal;
        }

        public int getBaseAbility() {
            return BaseAbility;
        }

        public int getSpecialAbility() {
            return SpecialAbility;
        }
}
