#include<iostream>
using namespace std;

class college_database{
	protected:
		
		string x[3]={"22UAI11629022004","22UAI12624012005","22UAI13413062005"};
		
	
		
		
};
 class person:public college_database{
		
	public:
		string name;
		string prn_pass;
		
		void dis()
		{
			cout<<"enter the prn no and password \n"<<endl;
			cin>>prn_pass;
			for(int i=0;i<3;i++){
			
		if (x[i]==prn_pass)	{
		cout<<"**************SHOWING RESULT*****************";
		
						
		}
		else{
					cout<<" Invalid prn no or password"<<endl;
			
		}
	}
}   
			void disp()
			{
				cout<<"error";
			}
			
		
};
class result:public person{
	public:
		
		char grade;
		int total_marks;
		float cgpa;
		
		
};
int main()
{
	result r1;
	r1.dis();
	r1.disp();
}
