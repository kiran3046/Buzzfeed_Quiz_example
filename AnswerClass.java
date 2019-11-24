    package BuzzfeedQuiz;

    public class AnswerClass {

        // result variable to show final result to User
        private String result;
        // method to calculate final result , calls another method check_max
        public String getResult(int answer_array[])
        {
          int answer=  check_max(answer_array);
          // set result according to the answer returned from check_max function
        switch (answer){
            case 0:
                result="Siberian husky";
                break;
            case 1:
                result="Bull dog";
                break;
            case 2:
                result="Pug";
                break;
            case 3:
                result="Labrador";
                break;
            default:
                result="Shephard";
                break;
        }

            return result;
        }

        // method to check which answer is repeated maximum number of times , parameter is an array of answers , e.g. if a repeated thrice then answer_array[0]=3
                                                                                                                    // if b repeats 1 time then answer_array[1]=1;
        public int check_max(int answer_array[]){
            //assume first element to be the max
            int max=answer_array[0];
            // position of maximum element in array(this will help us in printing result , 0 <==> a , 1 <==> b , and so on..
            int max_i=0;
            for(int i=1;i<answer_array.length;i++){
                if(answer_array[i]>max)
                {
                    // if any element greater than max is found , update max variable with that element and update max_i
                    max=answer_array[i];
                    max_i=i;
                }
            }
            return max_i;
        }
    }
