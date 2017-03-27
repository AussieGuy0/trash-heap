import requests, bs4, time
defaultHeaders =  {'User-agent':'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/56.0.2924.87 Safari/537.36'}
res = requests.get('https://www.reddit.com/r/dailyprogrammer/wiki/challenges', headers = defaultHeaders)
res.raise_for_status()
parsed = bs4.BeautifulSoup(res.text, "lxml")

tableBody = parsed.select('table')[1].tbody

for row in tableBody.find_all('tr'):
    count = 0;
    for td in row.find_all('td'):
        if count == 1: 
            print("num: " + td.text)
        elif count == 2:
            print("diff: " + td.text)
        elif count == 3:
            print("name: " + td.text)
        elif count == 4:
            link = td.a['href']
            print("link: " + link)
            #requests.get(link, headers = defaultHeaders)
            time.sleep(5)
        count = count + 1;
