public class cordingskill_02_porker {
    class CardsManager{
        //トランプ配列
        private int[] cards;
        //コンストラクた
        public Cards Manager(){
            //配列の作成
            card = new int[13* 4+1];
            //初期化
            organize();
        }
        //トランプの整列
        public void organize()
        {
            //ジョーカーを格納
            card[0] = 0;
            for(int i {= 1;i<=13;++i){
                //spade
                cards[0 ]=0;
                for(int i= 1;i<=13;++i){
                    cards[i] =100 +i;
                    //dayre
                    cards[i+13] =300+i;
                    // クラブを格納(添え字:27～39)
			cards[ i + 26 ] = 400 + i;

			// ハートを格納(添え字:40～52)
			cards[ i + 39 ] = 200 + i;
                }
            }
    //shaffle
    public void shuffle()
    {
        for(int i= 0; i<cards.length;++i){
            //0
            int rnd = (int)(Math.random()*(double)cards.length);
           // cards[ i ]とcards[ rnd ]を入れ替える
			int w = cards[ i ];
			cards[ i ] = cards[ rnd ];
			cards[ rnd ] = w;

        }
    }    
    // data get
    public int getCard(int num)
    {
        //num no.1-53 over -1
        if((1>num)||(53<num))return -1;
        //rerturn
        return cards[num-1];
    }
        }
        //メイン
        public class PokerHands{
            //error
            static final int ERROR = 0;
            //ポーカー
            //royal
            static final int ROYAL_FLUSH =1;
            //straight
            static final int STARAIGHT_FLUSH = 2;
            //fourcard
            static final int FOUR_OF_A_KIND =3;
            //fullhouse
            static final int FULL_HOUSE =4;
            //
            static final int FLUSH =5;
            static final int STRAIGHT = 6;
            static final int THREE_OF_A_KIND =7;
            static final int TWO_PAIR =8;
            static final int ONE_PAIR =9;
            static final int NO_PAIRE =10;
        }
        //no change
        static String getStringNumber(int num){
            switch(num){
                case 1:
                return "A";
                case 2:
                return "2";
                case 3:
				return "3";
			case 4:
				return "4";
			case 5:
				return "5";
			case 6:
				return "6";
			case 7:
				return "7";
			case 8:
				return "8";
			case 9:
				return "9";
			case 10:
				return "10";
			case 11:
				return "J";
			case 12:
				return "Q";
			case 13:
				return "K";
            }
            return"";
        }
        //main
        public static void main(String[]args){
            //class creat
            CardManager cards = new CardsManager();
            //変数
            int[]card5 ={ new int[5];
            //200
            int loopcount = 200;
            for(int j =0;j<loocount;++j){
                cards.shuffle();
                //
                int card_num=0;
                for(int i = 1;i<=53;++i){
                    cards.shuffle();
                    int card_num = 0;
                    for(inti= 1;i<=53;++i){
                        int card =cards.getCard(i);
                        if(0 == card)continue;
                        card5[card_num] = card;
                        ++card_num;
                        if(5==card_num)break;
                }

                //
                for ( int i = 0; i < 5; ++ i ) {
                    // マーク
                    int mark = cards5[ i ] / 100;
                    // 番号
                    int num = cards5[ i ] % 100;
    
                    // 番号を文字列に変更
                    String strnum = getStringNumber( num );
    
                    //　表示
                    switch ( mark ) {
                        case 1:
                            // スペード
                            System.out.print( "S" + strnum );
                            break;
                        case 2:
                            // ハート
                            System.out.print( "H" + strnum );
                            break;
                        case 3:
                            // ダイヤ
                            System.out.print( "D" + strnum );
                            break;
                        case 4:
                            // クラブ
                            System.out.print( "C" + strnum );
                            break;
                    }
                    System.out.print( " " );
                }
    
                // 役を判定
                int hand = getPockerHand( cards5 );
                switch ( hand ) {
                    case ROYAL_FLUSH:
                        System.out.println( "ロイヤルフラッシュ" );	
                        break;
    
                    case STRAIGHT_FLUSH:
                        System.out.println( "ストレートフラッシュ" );	
                        break;
    
                    case FOUR_OF_A_KIND:
                        System.out.println( "フォーカード" );	
                        break;
    
                    case FULL_HOUSE:
                        System.out.println( "フルハウス" );	
                        break;
    
                    case FLUSH:
                        System.out.println( "フラッシュ" );	
                        break;
    
                    case STRAIGHT:
                        System.out.println( "ストレート" );	
                        break;
    
                    case THREE_OF_A_KIND:
                        System.out.println( "スリーカード" );	
                        break;
    
                    case TWO_PAIR:
                        System.out.println( "ツーペア" );	
                        break;
    
                    case ONE_PAIR:
                        System.out.println( "ワンペア" );
                        break;
    
                    default:
                        System.out.println( "ノーペア" );
                        break;
                }
            }
        }
    }