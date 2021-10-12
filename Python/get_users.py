import discum
import pandas as pd
from discum.gateway.session import Session

from users_data_to_db import mySQL_client



      
bot = discum.Client(token="ODgwODgzMDMxNzQzODA3NTI4.YT-T1g.9XOpjj1rRSPbWLDXnrFDWEeS778")

def close_after_fetching(resp, guild_id):
    if bot.gateway.finishedMemberFetching(guild_id):
        lenmembersfetched = len(bot.gateway.session.guild(guild_id).members)
        print(str(lenmembersfetched) + ' members fetched')
        bot.gateway.removeCommand({'function': close_after_fetching, 'params': {'guild_id': guild_id}})
        bot.gateway.close()

def get_members(guild_id, channel_id):
    bot.gateway.fetchMembers(guild_id, channel_id, keep='all', wait=1)
    bot.gateway.command({'function': close_after_fetching, 'params': {'guild_id': guild_id}})
    bot.gateway.run()
    bot.gateway.resetSession()
    return bot.gateway.session.guild(guild_id).members
memberslist1=[]
memberslist2=[]
members = get_members('786917791508070410', '786985872611606569')
for userID in members:
    
    try:
        user_name=(members[userID]['nick'])
        
    except KeyError:
        print("üzgünüz elendiniz")
    except TypeError:
        print("bot atlandı")        
    if user_name==None:
        continue
    else:
        memberslist1.append(userID)
        memberslist2.append(user_name)



y = len(memberslist1)

for i in memberslist2:
    print(i)

project_2 = mySQL_client("localhost","project_2","root","admin12345")

project_2.add_user(memberslist1, memberslist2, y)
#project_2.add_user(memberslist1,memberslist2,x)

