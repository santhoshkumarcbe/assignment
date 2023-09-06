interface space{
                interface solarsystem{
                    interface earth{
                        void address();
                    }
                }
            }
        
    

    class nestedInterface implements space.solarsystem.earth{
        public void address(){
            System.out.println("Hai I am located in Earth ,solar system, milkyway galaxy, universe, metaverse, space.");

        }

        public static void main(String[] args) {
            nestedInterface l=new nestedInterface();
            l.address();
            
        }
    }





