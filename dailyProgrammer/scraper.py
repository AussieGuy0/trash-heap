import requests, bs4, time, os
defaultHeaders =  {'User-agent':'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/56.0.2924.87 Safari/537.36'}
res = requests.get('https://www.reddit.com/r/dailyprogrammer/wiki/challenges', headers = defaultHeaders)
res.raise_for_status()
parsed = bs4.BeautifulSoup(res.text, "lxml")

tableBody = parsed.select('table')[1].tbody

for row in tableBody.find_all('tr'):
    count = 0
    num = -1
    difficulty = ""
    name = "";
    for td in row.find_all('td'):
        if count == 1: 
            num = td.text
            print("num: " + td.text)
        elif count == 2:
            diff = td.text;
            print("diff: " + td.text)
        elif count == 3:
            name = td.text
            print("name: " + td.text)
        elif count == 4:
            link = td.a['href']
            print("link: " + link)
            linkResponse = requests.get(link, headers = defaultHeaders)
            linkResponse.raise_for_status()
            linkParsed = bs4.BeautifulSoup(linkResponse.text, "lxml")
            postElement = linkParsed.select('.expando')[0].select('div[class="md"]')[0]
            
            dirPath = num + "/" + diff.lower()

            if not os.path.isdir(dirPath):
                os.mkdir(dirPath)

            with open(dirPath + "/README.md", "w+") as f:
                if name != "":
                    f.write("# " + name + "\n")
                f.write(str(postElement))
                f.write("\n") # Add new line at end of file

            time.sleep(5)
        count = count + 1;
