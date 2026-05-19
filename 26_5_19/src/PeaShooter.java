class PeaShooter {
        //类的成员变量
        private int HP;  //生命值
        public int cost;  //费用
        public int ATK;   //攻击
        public double firingInterval; //射击间隔

    public PeaShooter(int HP, int cost, int ATK, double firingInterval) {
        this.HP = HP;
        this.cost = cost;
        this.ATK = ATK;
        this.firingInterval = firingInterval;
    }

    public int getHP() {
        return HP;
    }

    //类的成员方法
        public void AttackTheZombies() {  //攻击僵尸
            System.out.println("攻击僵尸");
        }

    @Override
    public String toString() {
        return "PeaShooter{" +
                "HP=" + HP +
                ", cost=" + cost +
                ", ATK=" + ATK +
                ", firingInterval=" + firingInterval +
                '}';
    }
    public static void main(String[] args) {
        PeaShooter bob = new PeaShooter(300,100,20,1.4);  //new实例化
        System.out.println(bob.toString());
    }
}


