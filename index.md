---
layout: home
---

<div>
  <div id="backgroundVideoContainer" class="sectionBorderBottom">
    <video autoplay muted loop id="backgroundVideo">
      <source src="https://derpcompany.github.io/assets/web/videos/front_page_video.mp4" type="video/mp4">
    </video>
    <div id="videoHeader">
    </div>
  </div>
  <div class="heightLarge"></div>
  <div class="sectionTriButton">
    <button class="triButton tintDark triButtonBackground1 triButtonHighlight1">
      <a href="{{ site.baseurl }}/sustainability/">{{ site.data.strings["sustainability"] }}</a>
    </button>
    <button class="triButton tintDark triButtonBackground2 triButtonHighlight2">
      <a href="{{ site.baseurl }}/events/">{{ site.data.strings["events"] }}</a>
    </button>
    <button class="triButton tintDark triButtonBackground1 triButtonHighlight1">
      <a href="{{ site.baseurl }}/social/">{{ site.data.strings["social_grups"] }}</a>
    </button>
  </div>
  <div class="heightLarge"></div>
</div>

<div id="container">
  <div id="content">
    <div class="section hideTopBorder backgroundGame1 backgroundImageCenter sectionBorderTop sectionBorderBottom sectionAlignEnd alignCenter justifySpaceAround">
      <div class="sectionColumnMain tintDark shadow">
        <h2>{{ site.data.strings["section_one_title"] }}</h2>
        <p class="bold">{{ site.data.strings["section_one_description"] }}</p>
        <div class="flexAlignStart">
          <button class="navButton">
            <a href="https://discord.gg/derpcompany">{{ site.data.strings["section_one_action"] }} »</a>
          </button>
        </div>
      </div>
      <div class="sectionColumnSub">
      </div>
    </div>
    <div class="section backgroundGame2 backgroundImageRight sectionBorderTop sectionBorderBottom sectionAlignStart alignCenter justifySpaceAround">
      <div class="sectionColumnMain tintDark shadow">
        <h2>{{ site.data.strings["section_two_title"] }}</h2>
        <p class="bold">{{ site.data.strings["section_two_description"] }}</p>
      </div>
      <div class="sectionColumnSub">
      </div>
    </div>
    <div class="section backgroundGame3 backgroundImageLeft backgroundImageLeftNotch sectionBorderTop sectionBorderBottom sectionAlignEnd alignCenter justifySpaceAround">
      <div class="sectionColumnMain tintDark shadow">
        <h2>{{ site.data.strings["section_three_title"] }}</h2>
        <p class="bold">{{ site.data.strings["section_three_description"] }}</p>
        <div class="flexAlignStart">
          <button class="navButton">
            <a href="{{ site.baseurl }}/join/">{{ site.data.strings["section_three_action"] }} »</a>
          </button>
        </div>
      </div>
      <div class="sectionColumnSub">
      </div>
    </div>
    <div class="section backgroundDiscord backgroundImageCenter alignCenter justifyCenter">
      <div class="sectionColumnMain">
        <iframe id="discordEmbed" src="https://discord.com/widget?id=154310693171101697&theme=dark" allowtransparency="true" frameborder="0" sandbox="allow-popups allow-popups-to-escape-sandbox allow-same-origin allow-scripts"></iframe>
      </div>
      <div class="sectionColumnSub">
        <button class="navButton navButtonInverted">
          <a href="https://discord.gg/derpcompany">{{ site.data.strings["join_discord"] }} »</a>
        </button>
      </div>
    </div>
  </div>
</div>
